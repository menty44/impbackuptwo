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

package org.eclipse.webdav.internal.kernel;

import org.eclipse.webdav.ILocator;
import org.eclipse.webdav.internal.kernel.utils.Assert;

/**
 * A <code>LocatorImpl</code> uniquely identifies a DAV
 * a resource.
 * <p>
 * This class implements the <code>Locator</code>
 * interface.</p>
 *
 * @see Locator
 */
public class Locator implements ILocator {

    protected String resourceURL;
    protected String label;
    protected boolean isStable;

    public Locator(String resourceURL, String label) {
        super();
        Assert.isLegal(resourceURL != null);
        this.resourceURL = resourceURL;
        this.label = label;
        this.isStable = false;
    }

    /**
     * Return a boolean value indicating whether or not this locator
     * and the given object are equal.
     *
     * @param obj the object to compare against
     * @return equality indicator
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ILocator))
            return false;
        ILocator locator = (ILocator) obj;
        if (!resourceURL.equals(locator.getResourceURL()))
            return false;
        if (label == null)
            return locator.getLabel() == null;
        return label.equals(locator.getLabel());
    }

    public int hashCode() {
        return resourceURL.hashCode();
    }

    public String getLabel() {
        return label;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public boolean isStable() {
        return isStable;
    }

    public void markStable() {
        // Stable URLs cannot not have a label.
        Assert.isTrue(label == null);
        isStable = true;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[Locator "); //$NON-NLS-1$
        buffer.append(resourceURL);
        if (label != null) {
            buffer.append("\n  label: "); //$NON-NLS-1$
            buffer.append(label);
        }
        if (isStable)
            buffer.append("\n  stable"); //$NON-NLS-1$
        buffer.append("]"); //$NON-NLS-1$
        return buffer.toString();
    }
}
