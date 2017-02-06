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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.guvnor.tools.Messages;
import org.guvnor.tools.utils.PlatformUtils;

/**
 * Wizard page for selecting the location where Guvnor resources will be copied.
 */
public class SelectLocalTargetPage extends WizardPage {

    private TreeViewer viewer;

    public SelectLocalTargetPage(String pageName) {
        super(pageName);
    }

    public SelectLocalTargetPage(String pageName, String title, ImageDescriptor titleImage) {
        super(pageName, title, titleImage);
    }

    public void createControl(Composite parent) {
        Composite composite = PlatformUtils.createComposite(parent, 1);
        new Label(composite, SWT.NONE).setText(Messages.getString("select.location")); //$NON-NLS-1$

        viewer = new TreeViewer(composite, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
        viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
        viewer.setLabelProvider(new WorkbenchLabelProvider());
        WorkbenchContentProvider cp = new WorkbenchContentProvider();
        viewer.setContentProvider(cp);
        viewer.setFilters(new ViewerFilter[] { new ProjectFilter() });
        viewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                updateModel();
            }
        });
        viewer.setInput(ResourcesPlugin.getWorkspace());
        super.setControl(composite);
    }

    private void updateModel() {
        IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
        if (!selection.isEmpty()
           && selection.getFirstElement() instanceof IContainer) {
            IContainer container = (IContainer)selection.getFirstElement();
            GuvWizardModel model = ((IGuvnorWizard)super.getWizard()).getModel();
            model.setTargetLocation(container.getFullPath().toString());
            super.getWizard().getContainer().updateButtons();
        }
    }

    class ProjectFilter extends ViewerFilter {
        @Override
        public boolean select(Viewer viewer, Object parent, Object element) {
            return element instanceof IContainer;
        }
    }
}
