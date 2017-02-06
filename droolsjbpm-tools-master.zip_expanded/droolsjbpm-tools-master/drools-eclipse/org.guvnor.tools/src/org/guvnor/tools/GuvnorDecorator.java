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

package org.guvnor.tools;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.guvnor.tools.preferences.GuvnorPreferencePage;
import org.guvnor.tools.preferences.IGuvnorPreferenceConstants;
import org.guvnor.tools.utils.GuvnorMetadataProps;
import org.guvnor.tools.utils.GuvnorMetadataUtils;
/**
 * Handles decorating Guvnor resources with an icon overlay and label text.
 */
public class GuvnorDecorator implements ILightweightLabelDecorator {

    public static final String DECORATOR_ID = "org.guvnor.tools.decorator"; //$NON-NLS-1$

    private boolean isGuvnorResource(Object element) {
        if (element instanceof IResource) {
            return GuvnorMetadataUtils.findGuvnorMetadata((IResource)element) != null;
        } else {
            return false;
        }
    }

    private void decorateResource(IResource resource, IDecoration decoration) {
        try {
            if (resource instanceof IFile) {

                if(!((IFile)resource).exists()){
                    return ;
                }

                addGuvnorOverlay(decoration);
                addChangeIndicator(resource, decoration);
                addResourceDetails(resource, decoration);
            }
        } catch (Exception e) {
            Activator.getDefault().writeLog(IStatus.ERROR, e.getMessage(), e);
        }
    }

    private void addGuvnorOverlay(IDecoration decoration) {
        int overlayLoc = GuvnorPreferencePage.getOverlayLocationPref();
        if (overlayLoc != IGuvnorPreferenceConstants.NO_OVERLAY) {
            decoration.addOverlay(Activator.getImageDescriptor(Activator.IMG_GUVCONTROLLED),
                                 overlayLoc);
        }
    }

    private void addResourceDetails(IResource resource, IDecoration decoration)
            throws Exception {
        GuvnorMetadataProps props = GuvnorMetadataUtils.getGuvnorMetadata(resource);
        if (props.getVersion() != null) {
            boolean showRevision = GuvnorPreferencePage.shouldShowRevision();
            boolean showDateTime = GuvnorPreferencePage.shouldShowTimeDateStamp();
            if (showRevision || showDateTime) {
                decoration.addSuffix(" ");     //$NON-NLS-1$
            }
            if (showRevision) {
                decoration.addSuffix(props.getRevision());
            }
            if (showDateTime) {
                if (showRevision) {
                    decoration.addSuffix(", " + props.getVersion());         //$NON-NLS-1$
                } else {
                    decoration.addSuffix(props.getVersion());
                }
            }
        }
    }

    private void addChangeIndicator(IResource resource, IDecoration decoration)
            throws CoreException {
        if (!GuvnorMetadataUtils.isGuvnorResourceCurrent(resource)
           && GuvnorPreferencePage.shouldShowChangeIndicator()) {
            decoration.addSuffix(" >"); //$NON-NLS-1$
        }
    }

    public void decorate(Object element, IDecoration decoration) {
        if (isGuvnorResource(element)) {
            if (element instanceof IResource) {
                decorateResource((IResource)element, decoration);
            } else {
                Activator.getDefault().writeLog(IStatus.ERROR,
                        "Called to decorate unknown: " + element.getClass().toString(), new Exception()); //$NON-NLS-1$
            }
        }
    }

    public void addListener(ILabelProviderListener listener) { }

    public void dispose() { }

    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    public void removeListener(ILabelProviderListener listener) { }
}
