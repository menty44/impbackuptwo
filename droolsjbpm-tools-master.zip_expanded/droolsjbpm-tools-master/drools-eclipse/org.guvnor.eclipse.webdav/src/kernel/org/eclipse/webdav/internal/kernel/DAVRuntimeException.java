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

public class DAVRuntimeException extends RuntimeException {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 510l;

    // The wrapped exception, if one exists
    private Throwable fWrappedException = null;

    // The status code for the exception
    private int fErrorCode = 0;

    /**
     * Create and answer a new runtime exception with the specified error code
     * and descriptive message.
     *
     * @param code the error code for the exception
     * @param message a string describing the exception
     */
    public DAVRuntimeException(int code, String message) {
        super(message);
        setErrorCode(code);
    }

    /**
     * Create and answer a new runtime exception with the given
     * descriptive message.
     *
     * @param message a string describing the exception
     */
    public DAVRuntimeException(String message) {
        super(message);
    }

    /**
     * Create and answer a runtime exception which wraps the given
     * exception.
     */
    public DAVRuntimeException(Throwable exception) {
        super();
        if (exception instanceof DAVRuntimeException)
            setWrappedException(((DAVRuntimeException) exception).getWrappedException());
        else
            setWrappedException(exception);
    }

    /**
     * Makes the same association between exception argument and error code as
     * <code>DAVRuntimeException(Exception)</code>
     *
     * @param exception the exception to wrap
     * @param message a string describing the exception
     */
    public DAVRuntimeException(Throwable exception, String message) {
        super(message + "\n " + Policy.bind("label.exceptionMessage") + exception.getMessage()); //$NON-NLS-1$ //$NON-NLS-2$
        setWrappedException(exception);
    }

    /**
     * Answer the error code which is set on the receiver. If the receiver
     * wraps a DAV4JException, then get the error code from the wrapped
     * exception.
     */
    public int getErrorCode() {
        if (getWrappedException() != null && getWrappedException() instanceof DAVRuntimeException)
            return ((DAVRuntimeException) getWrappedException()).getErrorCode();
        return fErrorCode;
    }

    /**
     * Answer the receiver's field which holds onto the exception
     * which the receiver wraps.
     *
     * @return the wrapped exception
     */
    public Throwable getWrappedException() {
        return fWrappedException;
    }

    /**
     * If the receiver wraps an exception, then ask the exception to
     * print out a stack trace to the system output.
     */
    public void printStackTrace() {
        Throwable wrappedException = getWrappedException();
        if (wrappedException != null)
            wrappedException.printStackTrace();
        else
            super.printStackTrace();
    }

    /**
     * Set the receiver's field which holds onto the error code.
     *
     * @param errorCode the error code for the exception
     */
    protected void setErrorCode(int errorCode) {
        fErrorCode = errorCode;
    }

    /**
     * Set the receiver's field which holds onto the wrapped exception.
     *
     * @param exception the exception to be wrapped
     */
    protected void setWrappedException(Throwable exception) {
        fWrappedException = exception;
    }
}
