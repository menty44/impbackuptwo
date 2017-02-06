/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.guvnor.tools.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.guvnor.tools.Activator;
import org.guvnor.tools.GuvnorRepository;
import org.guvnor.tools.Messages;
import org.guvnor.tools.utils.PlatformUtils;
import org.guvnor.tools.views.RepositoryContentProvider;
import org.guvnor.tools.views.RepositoryLabelProvider;
import org.guvnor.tools.views.model.TreeObject;
import org.guvnor.tools.views.model.TreeObject.Type;
import org.guvnor.tools.views.model.TreeParent;

/**
 * Wizard page for selecting a target folder in Guvnor.
 */
public class SelectGuvnorFolderPage extends WizardPage {

    private TreeViewer viewer;
    private String previousSelection;

    public SelectGuvnorFolderPage(String pageName) {
        super(pageName);
    }

    public SelectGuvnorFolderPage(String pageName, String title, ImageDescriptor titleImage) {
        super(pageName, title, titleImage);
    }

    public void createControl(Composite parent) {
        Composite composite = PlatformUtils.createComposite(parent, 1);
        new Label(composite, SWT.NONE).setText(Messages.getString("select.folder")); //$NON-NLS-1$

        viewer = new TreeViewer(composite, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
        viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
        viewer.setLabelProvider(new RepositoryLabelProvider());
        viewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                updateModel();
            }
        });
        viewer.addFilter(new ViewerFilter() {
            @Override
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                // The snapshots directory in Guvnor is read-only for Eclipse tools
                if (element instanceof TreeObject) {
                    TreeObject o = (TreeObject)element;
                    return o.getFullPath().indexOf("/snapshots/") == -1; //$NON-NLS-1$
                } else {
                    return true;
                }
            }
        });
        super.setControl(composite);
    }

    private void handleRepositoryCreation() {
        // First we'll see if the repository already exists
        GuvWizardModel model = ((IGuvnorWizard)super.getWizard()).getModel();
        if (model.shouldCreateNewRep()
           && model.getRepLocation() != null) {
            GuvnorRepository theRep = Activator.getLocationManager().
                                        findRepository(model.getRepLocation());
            if (theRep != null) {
                // The repository already exists, nothing to do
                return;
            }
            try {
                WizardUtils.createGuvnorRepository(model);
            } catch (Exception e) {
                super.setErrorMessage(e.getMessage());
                Activator.getDefault().writeLog(IStatus.ERROR, e.getMessage(), e);
            }
        }
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            // Need to filter repository list based on currently selected repository
            // Will also keep track of which filter is applied, so we don't create
            // additional content providers unnecessarily.
            GuvWizardModel model = ((IGuvnorWizard)super.getWizard()).getModel();
            String currentSelection = model.getRepLocation();
            // Not supposed to use this page without setting the target repository in the model
            assert(currentSelection != null);
            // If we had a repository selection before that is different from the current selection
            if (previousSelection != null
               && !currentSelection.equals(previousSelection)) {
                handleRepositoryCreation();
                RepositoryContentProvider cp = new RepositoryContentProvider();
                cp.setRepositorySelection(currentSelection);
                viewer.setContentProvider(cp);
                viewer.setInput(viewer);
                previousSelection = currentSelection;
            } else {
                // If we didn't have a repository selection before (first time this page is loaded)
                if (previousSelection == null) {
                    handleRepositoryCreation();
                    RepositoryContentProvider cp = new RepositoryContentProvider();
                    cp.setRepositorySelection(currentSelection);
                    viewer.setContentProvider(cp);
                    viewer.setInput(viewer);
                    previousSelection = currentSelection;
                }
            }
        }
        super.setVisible(visible);
    }

    private void updateModel() {
        if (super.getErrorMessage() != null) {
            super.setErrorMessage(null);
        }
        IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
        GuvWizardModel model = ((IGuvnorWizard)super.getWizard()).getModel();
        if (selection.getFirstElement() instanceof TreeParent) {
            TreeParent node = (TreeParent)selection.getFirstElement();
            if (node.getNodeType() != Type.NONE) {
                viewer.expandToLevel(node, 1);
                String base = node.getFullPath().endsWith("/")?node.getFullPath():node.getFullPath() + "/"; //$NON-NLS-1$ //$NON-NLS-2$
                model.setTargetLocation(base);
                super.getWizard().getContainer().updateButtons();
            } else {
                model.setTargetLocation(null);
                super.getWizard().getContainer().updateButtons();
            }
        } else {
            model.setTargetLocation(null);
            super.getWizard().getContainer().updateButtons();
        }
    }
}
