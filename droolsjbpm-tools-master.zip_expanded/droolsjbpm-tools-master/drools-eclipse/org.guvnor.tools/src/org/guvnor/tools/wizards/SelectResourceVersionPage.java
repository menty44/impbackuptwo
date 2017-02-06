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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.guvnor.tools.Messages;
import org.guvnor.tools.utils.PlatformUtils;

/**
 * Wizard page for selecting the revision of a given resource.
 */
public class SelectResourceVersionPage extends WizardPage {

    private List versions;

    public SelectResourceVersionPage(String pageName) {
        super(pageName);
    }

    public SelectResourceVersionPage(String pageName, String title, ImageDescriptor titleImage) {
        super(pageName, title, titleImage);
    }

    public void createControl(Composite parent) {
        Composite composite = PlatformUtils.createComposite(parent, 1);
        new Label(composite, SWT.NONE).setText(Messages.getString("select.version")); //$NON-NLS-1$

        versions = new List(composite, SWT.BORDER | SWT.MULTI);
        versions.setLayoutData(new GridData(GridData.FILL_BOTH));
        populateVersions();

        super.setControl(composite);
    }

    private void populateVersions() {
        versions.add("v20080424"); //$NON-NLS-1$
        versions.add("v20080516"); //$NON-NLS-1$
        versions.add("v20080522"); //$NON-NLS-1$
        versions.add("v20080705"); //$NON-NLS-1$
        versions.setSelection(0);
    }
}
