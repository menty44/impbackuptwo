/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.eclipse.webdav.dom;

import org.w3c.dom.Element;

/**
 * An element editor for the WebDAV owner element. See RFC2518 section
 * 12.10 for the element's definition.
 * <p>
 * <b>Note:</b> This class/interface is part of an interim API that is still under 
 * development and expected to change significantly before reaching stability. 
 * It is being made available at this early stage to solicit feedback from pioneering 
 * adopters on the understanding that any code that uses this API will almost 
 * certainly be broken (repeatedly) as the API evolves.
 * </p>
 *
 * @see ActiveLock
 * @see LockInfo
 */
public class Owner extends ElementEditor {
    /**
     * Creates a new editor on the given WebDAV owner element. The element
     * is assumed to be well formed.
     *
     * @param root a owner element
     * @throws        MalformedElementException if there is reason to
     *                believe that the element is not well formed
     */
    public Owner(Element root) throws MalformedElementException {
        super(root, "owner"); //$NON-NLS-1$
    }
}
