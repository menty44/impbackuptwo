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

package org.guvnor.tools.preferences;

import org.guvnor.tools.Messages;

/**
 * Constants for Guvnor tools preference names and values.
 */
public interface IGuvnorPreferenceConstants {

    // Value is a string, specified in GUVNOR_LOC_TEMPLATE_DEFAULT
    public String GUVNOR_LOC_TEMPLATE_PREF = "guvnor_loc_template"; //$NON-NLS-1$

    public String GUVNOR_LOC_TEMPLATE_DEFAULT = "http://localhost:8080/drools-guvnor/org.drools.guvnor.Guvnor/webdav/"; //$NON-NLS-1$

    public String SAVE_PASSWORDS_PREF = "save_passwords"; //$NON-NLS-1$

    // Value it an integer, specified in OVERLAY_LOCATIONS
    public String OVERLAY_LOCATION_PREF = "overlay_location"; //$NON-NLS-1$

    // Text for the corresponding IDecoration overlay locations, 0 -> 3. 4 is for "don't display"
    public String[] OVERLAY_LOCATIONS = { Messages.getString("top.left"),  //$NON-NLS-1$
                                          Messages.getString("top.right"),  //$NON-NLS-1$
                                          Messages.getString("bottom.left"),  //$NON-NLS-1$
                                          Messages.getString("bottom.right"),  //$NON-NLS-1$
                                          Messages.getString("no.overlay") }; //$NON-NLS-1$

    public int NO_OVERLAY = 4;

    // The default location is top right
    public int OVERLAY_LOCATION_DEFAULT = 1;

    // Value is a boolean, true by default
    public String SHOW_CHANGE_INDICATOR_PREF = "show_change_indicator"; //$NON-NLS-1$

    // Value is a boolean, true by default
    public String SHOW_REVISION_PREF = "show_revision"; //$NON-NLS-1$

    // Value is a boolean, true by default
    public String SHOW_DATETIME_PREF = "show_datetime"; //$NON-NLS-1$
}
