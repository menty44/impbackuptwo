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

import java.text.MessageFormat;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.guvnor.tools.Activator;
import org.guvnor.tools.Messages;
import org.guvnor.tools.utils.GuvnorMetadataUtils;
import org.guvnor.tools.utils.PlatformUtils;

/**
 * Wizard for adding resources to Guvnor.
 */
public class AddResourceWizard extends Wizard implements INewWizard, IGuvnorWizard {

    private SelectGuvnorRepPage        selectRepPage;
    private GuvnorMainConfigPage     mainConfigPage;
    private SelectGuvnorFolderPage     selectFolderPage;

    private IStructuredSelection     selectedItems;

    private GuvWizardModel model;

    public AddResourceWizard() {
        model = new GuvWizardModel();
    }

    public GuvWizardModel getModel() {
        return model;
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
        selectedItems = selection;
    }

    @Override
    public void addPages() {
        selectRepPage = new SelectGuvnorRepPage("select_rep_page", Messages.getString("select.guvnor.rep.location"), //$NON-NLS-1$ //$NON-NLS-2$
                                Activator.getImageDescriptor(Activator.IMG_GUVREPWIZBAN));
        selectRepPage.setDescription(Messages.getString("select.guvnor.rep.location.desc")); //$NON-NLS-1$
        super.addPage(selectRepPage);

        mainConfigPage = new GuvnorMainConfigPage("config_page", Messages.getString("new.guvnor.rep.loc"),  //$NON-NLS-1$ //$NON-NLS-2$
                                Activator.getImageDescriptor(Activator.IMG_GUVREPWIZBAN));
        mainConfigPage.setDescription(Messages.getString("new.guvnor.rep.loc.desc")); //$NON-NLS-1$
        super.addPage(mainConfigPage);

        selectFolderPage = new SelectGuvnorFolderPage("select_folder_page", Messages.getString("select.folder"), //$NON-NLS-1$ //$NON-NLS-2$
                                Activator.getImageDescriptor(Activator.IMG_GUVREPWIZBAN));
        selectFolderPage.setDescription(Messages.getString("select.folder.desc")); //$NON-NLS-1$
        super.addPage(selectFolderPage);

        super.addPages();
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.getName().equals("select_rep_page")) { //$NON-NLS-1$
            if (model.shouldCreateNewRep()) {
                return mainConfigPage;
            } else {
                return selectFolderPage;
            }
        }
        if (page.getName().equals("config_page")) { //$NON-NLS-1$
            return selectFolderPage;
        }
        return null;
    }

    private void setDuplicateFileError(IFile selectedFile) {
        selectFolderPage.setErrorMessage(MessageFormat.format(
                                            Messages.getString("already.exists.folder"), //$NON-NLS-1$
                                            new Object[] { selectedFile.getName(),
                                                           model.getTargetLocation() }));
        model.setTargetLocation(null);
        super.getContainer().updateButtons();
    }

    private boolean processSelectedFile(IFile selectedFile) {
        boolean res = GuvnorMetadataUtils.
                        addResourceToGuvnor(model.getRepLocation(),
                                            model.getTargetLocation(),
                                            selectedFile);
        if (!res) {
            setDuplicateFileError(selectedFile);
        }
        return res;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean performFinish() {
        boolean res = true;
        assert(selectedItems != null);
        for (Iterator it = selectedItems.iterator(); it.hasNext();) {
            Object oneItem = it.next();
            if (oneItem instanceof IFile) {
                res = processSelectedFile((IFile)oneItem);
                if (!res) {
                    break;
                }
            }
        }
        PlatformUtils.updateDecoration();
        return res;
    }

    @Override
    public boolean canFinish() {
        return model.getRepLocation() != null
               && model.getTargetLocation() != null;
    }
}
