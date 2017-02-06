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

package org.guvnor.tools.utils;

import java.text.MessageFormat;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.guvnor.tools.Activator;
import org.guvnor.tools.Messages;
import org.guvnor.tools.views.ResourceHistoryContentProvider;
import org.guvnor.tools.views.ResourceHistoryLabelProvider;
import org.guvnor.tools.views.model.ResourceHistoryEntry;

/**
 * Dialog for choosing a Guvnor revision of a selected resource.
 */
public class VersionChooserDialog extends TitleAreaDialog {

    private static final int INITIAL_WIDTH = 790;
    private static final int INITIAL_HEIGHT = 350;

    private String fileName;
    private ResourceHistoryEntry[] entries;

    private ResourceHistoryEntry selectedEntry;

    private TableViewer viewer;

    public VersionChooserDialog(Shell parentShell, String fileName, ResourceHistoryEntry[] entries) {
        super(parentShell);
        super.setShellStyle(getShellStyle() | SWT.RESIZE);
        this.entries = entries;
        this.fileName = fileName;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        super.setTitle(Messages.getString("version.dialog.caption")); //$NON-NLS-1$
        super.setMessage(MessageFormat.format(Messages.getString("version.dialog.message"), //$NON-NLS-1$
                                             new Object[] { fileName }));
        super.setTitleImage(Activator.getImageDescriptor(Activator.IMG_GUVREPWIZBAN).createImage());

        viewer = new TableViewer(PlatformUtils.createResourceHistoryTable(parent));
        viewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));

        viewer.setContentProvider(new ResourceHistoryContentProvider(entries));
        viewer.setLabelProvider(new ResourceHistoryLabelProvider());
        viewer.setSorter(new ResourceHistorySorter());
        viewer.setInput(this);
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                if (viewer.getSelection() instanceof IStructuredSelection) {
                    IStructuredSelection sel = (IStructuredSelection)viewer.getSelection();
                    if (sel.getFirstElement() instanceof ResourceHistoryEntry) {
                        selectedEntry = (ResourceHistoryEntry)sel.getFirstElement();
                    }
                }
            }
        });

        if (entries.length > 0) {
            viewer.getTable().setSelection(0);
            selectedEntry = entries[0];
        }

        return super.createDialogArea(parent);
    }

    @Override
    protected Point getInitialSize() {
        // Try to set a reasonable default size.
        return new Point(INITIAL_WIDTH, INITIAL_HEIGHT);
    }

    public ResourceHistoryEntry getSelectedEntry() {
        return selectedEntry;
    }
}
