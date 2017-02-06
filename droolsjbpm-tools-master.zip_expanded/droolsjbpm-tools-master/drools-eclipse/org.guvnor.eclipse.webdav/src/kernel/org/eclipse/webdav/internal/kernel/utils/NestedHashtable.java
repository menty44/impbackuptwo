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

package org.eclipse.webdav.internal.kernel.utils;

import java.util.Enumeration;
import java.util.Hashtable;

public class NestedHashtable {

    protected Hashtable localValues = new Hashtable(5);
    protected NestedHashtable defaults = null;

    public NestedHashtable() {
        super();
    }

    /**
     * Constructor for the class. Set the defaults to be
     * the given value.
     *
     * @param defaults the default values for the receiver
     */
    public NestedHashtable(NestedHashtable defaults) {
        super();
        this.defaults = defaults;
    }

    /**
     * Copy all the default values into the receiver.
     */
    public void collapse() {
        if (defaults != null) {
            Enumeration keysEnum = defaults.keys();
            while (keysEnum.hasMoreElements()) {
                Object key = keysEnum.nextElement();
                localValues.put(key, defaults.get(key));
            }
            defaults = null;
        }
    }

    /**
     * Return the value for the given key.
     *
     * @param key the key to look up
     * @return the value for the key or null if none.
     */
    public Object get(Object key) {
        Object value = localValues.get(key);
        if (value == null && defaults != null)
            return defaults.get(key);
        return value;
    }

    /**
     * Return an enumeration over the context's keys. (recursively computes the
     * keys based on keys defaults as well)
     *
     * @return an enumeration over the context keys
     */
    public Enumeration keys() {
        if (defaults == null)
            return localValues.keys();
        return new MergedEnumeration(localValues.keys(), defaults.keys());
    }

    /**
     * Put the given key-value pair into the context.
     *
     * @param key the key
     * @param value its associated value
     */
    public void put(Object key, Object value) {
        localValues.put(key, value);
    }

    /**
     * Remove the given key from the context
     *
     * @param key the key to remove
     */
    public Object remove(Object key) {
        return localValues.remove(key);
    }

    /**
     * Return a string representation of the context.
     *
     * @return the context, as a String
     * @see #toString()
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        Enumeration keysEnum = keys();
        while (keysEnum.hasMoreElements()) {
            Object key = keysEnum.nextElement();
            buffer.append(key.toString());
            buffer.append(": "); //$NON-NLS-1$
            buffer.append(get(key).toString());
            buffer.append('\n');
        }
        return buffer.toString();
    }
}
