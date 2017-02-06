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

import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.eclipse.webdav.Policy;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * An element editor for the WebDAV supportedlock element. See RFC2518
 * section 13.11 for the element's definition.
 * <p>
 * <b>Note:</b> This class/interface is part of an interim API that is still under 
 * development and expected to change significantly before reaching stability. 
 * It is being made available at this early stage to solicit feedback from pioneering 
 * adopters on the understanding that any code that uses this API will almost 
 * certainly be broken (repeatedly) as the API evolves.
 * </p>
 *
 * @see LockEntry
 */
public class SupportedLock extends Property {
    /**
     * An ordered collection of the element names of the supportedlock
     * element's children.
     */
    protected static final String[] childNames = new String[] {"lockentry"}; //$NON-NLS-1$

    /**
     * Creates a new editor on the given WebDAV supportedlock element. The
     * element is assumed to be well formed.
     *
     * @param root a supportedlock element
     * @throws        MalformedElementException if there is reason to
     *                believe that the element is not well formed
     */
    public SupportedLock(Element root) throws MalformedElementException {
        super(root, "supportedlock"); //$NON-NLS-1$
    }

    /**
     * Creates a new lockentry and adds it to this supported lock. Returns
     * an editor on the new lockentry.
     *
     * @return an editor on a new lockentry for this supportedlock
     */
    public LockEntry addLockEntry() {

        Element lockentry = addChild(root, "lockentry", childNames, false); //$NON-NLS-1$
        Element locktype = appendChild(lockentry, "locktype"); //$NON-NLS-1$
        appendChild(locktype, "write"); //$NON-NLS-1$

        LockEntry result = null;
        try {
            result = new LockEntry(lockentry);
        } catch (MalformedElementException e) {
            Assert.isTrue(false, Policy.bind("assert.internalError")); //$NON-NLS-1$
        }

        return result;
    }

    /**
     * Returns an <code>Enumeration</code> over this supportedlock's
     * <code>LockEntry</code>s.
     *
     * @return an <code>Enumeration</code> of <code>LockEntry</code>s
     * @throws MalformedElementException if there is reason to believe that
     *         this editor's underlying element is not well formed
     */
    public Enumeration getLockEntries() throws MalformedElementException {

        final Node firstLockEntry = getFirstChild(root, "lockentry"); //$NON-NLS-1$

        Enumeration e = new Enumeration() {
            Node currentLockEntry = firstLockEntry;

            public boolean hasMoreElements() {

                return currentLockEntry != null;
            }

            public Object nextElement() {

                if (!hasMoreElements())
                    throw new NoSuchElementException();

                LockEntry result = null;
                try {
                    result = new LockEntry((Element) currentLockEntry);
                } catch (MalformedElementException ex) {
                    Assert.isTrue(false, Policy.bind("assert.internalError")); //$NON-NLS-1$
                }

                currentLockEntry = getTwin((Element) currentLockEntry, true);
                return result;
            }
        };

        return e;
    }
}
