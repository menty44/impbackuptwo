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

public class SystemException extends DAVException {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 510l;
    protected Exception wrappedException;

    /**
     * SystemException default constructor.
     */
    public SystemException() {
        super();
    }

    public SystemException(Exception e) {
        super(e.getMessage());
        wrappedException = e;
    }

    public SystemException(String s) {
        super(s);
    }

    public Exception getWrappedException() {
        return wrappedException;
    }

    public void setWrappedException(Exception e) {
        wrappedException = e;
    }
}
