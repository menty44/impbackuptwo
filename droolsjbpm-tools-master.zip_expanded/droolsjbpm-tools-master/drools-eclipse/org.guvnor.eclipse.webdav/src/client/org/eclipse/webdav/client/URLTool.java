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

package org.eclipse.webdav.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;
import org.eclipse.webdav.internal.kernel.utils.Assert;

/**
 * A utility for manipulating <code>URL</code>s.
 * <p>
 * <b>Note:</b> This class/interface is part of an interim API that is still under 
 * development and expected to change significantly before reaching stability. 
 * It is being made available at this early stage to solicit feedback from pioneering 
 * adopters on the understanding that any code that uses this API will almost 
 * certainly be broken (repeatedly) as the API evolves.
 * </p>
 */
public class URLTool {
    /**
     * Returns the given URL with a trailing slash appended to it. If the URL
     * already has a trailing slash the URL is returned unchanged.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Returned URL</th>
     * <tr>
     *   <td>"http://hostname/folder"</td>
     *   <td>"http://hostname/folder/"</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>"http://hostname/folder/"</td>
     * </table>
     *
     * @param url a URL
     * @return    the given URL with a trailing slash
     * @throws    MalformedURLException if the given URL is malformed
     */
    public static URL appendTrailingSlash(String url) throws MalformedURLException {
        return appendTrailingSlash(new URL(url));
    }

    /**
     * Returns the given <code>URL</code> with a trailing slash appended to
     * it. If the <code>URL</code> already has a trailing slash the
     * <code>URL</code> is returned unchanged.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Returned URL</th>
     * <tr>
     *   <td>"http://hostname/folder"</td>
     *   <td>"http://hostname/folder/"</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>"http://hostname/folder/"</td>
     * </table>
     *
     * @param url a URL
     * @return    the given URL with a trailing slash
     */
    public static URL appendTrailingSlash(URL url) {
        String file = url.getFile();
        if (file.endsWith("/")) { //$NON-NLS-1$
            return url;
        }
        try {
            return new URL(url.getProtocol(), url.getHost(), url.getPort(), file + "/"); //$NON-NLS-1$
        } catch (MalformedURLException e) {
            Assert.isTrue(false, Policy.bind("assert.internalError")); //$NON-NLS-1$
        }
        return null;
    }

    /**
     * Returns the child URL formed by joining the given member with the
     * given parent URL.
     *
     * @return a child URL of the given parent
     * @throws MalformedURLException if the given parent is malformed
     */
    public static URL getChild(String parent, String member) throws MalformedURLException {
        return getChild(new URL(parent), member);
    }

    /**
     * Returns the child URL formed by joining the given member with the
     * given parent URL.
     *
     * @return a child URL of the given parent
     */
    public static URL getChild(URL parent, String member) {
        String file = parent.getFile();
        if (!file.endsWith("/")) //$NON-NLS-1$
            file = file + "/"; //$NON-NLS-1$
        try {
            return new URL(parent.getProtocol(), parent.getHost(), parent.getPort(), file + member);
        } catch (MalformedURLException e) {
            Assert.isTrue(false, Policy.bind("assert.internalError")); //$NON-NLS-1$
        }
        return null;
    }

    /**
     * Returns all elements in the given URLs path.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Element</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>[]</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>[folder]</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>[folder, file]</td>
     * </table>
     * @param url a URL
     * @return    all elements in the given URLs path
     * @throws    MalformedURLException if the given URL is malformed
     */
    public static Vector getElements(String url) throws MalformedURLException {
        return getElements(new URL(url));
    }

    /**
     * Returns all elements in the given URLs path.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Element</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>[]</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>[folder]</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>[folder, file]</td>
     * </table>
     * @param url a URL
     * @return    all elements in the given URLs path
     */
    public static Vector getElements(URL url) {
        Vector result = new Vector(5);
        String lastElement = null;
        while ((lastElement = getLastElement(url)) != null) {
            result.insertElementAt(lastElement, 0);
            url = getParent(url);
        }
        return result;
    }

    /**
     * Returns the last element in the given URLs path, or <code>null</code>
     * if the URL is the root.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Last Element</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>null</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>folder</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>file</td>
     * </table>
     * @param url a URL
     * @return    the last element in the given URLs path, or
     *            <code>null</code> if the URL is the root
     * @throws    MalformedURLException if the given URL is malformed
     */
    public static String getLastElement(String url) throws MalformedURLException {
        return getLastElement(new URL(url));
    }

    /**
     * Returns the last element in the given URLs path, or <code>null</code>
     * if the URL is the root.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Last Element</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>null</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>folder</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>file</td>
     * </table>
     * @param url a URL
     * @return    the last element in the given URLs path, or
     *            <code>null</code> if the URL is the root
     */
    public static String getLastElement(URL url) {
        String file = url.getFile();
        int len = file.length();

        if (len == 0 || len == 1 && file.charAt(0) == '/') {
            return null;
        }

        int lastSlashIndex = -1;
        for (int i = len - 2; lastSlashIndex == -1 && i >= 0; --i) {
            if (file.charAt(i) == '/') {
                lastSlashIndex = i;
            }
        }

        boolean isDirectory = file.charAt(len - 1) == '/';
        if (lastSlashIndex == -1) {
            if (isDirectory)
                return file.substring(0, len - 1);
            return file;
        }
        if (isDirectory)
            return file.substring(lastSlashIndex + 1, len - 1);
        return file.substring(lastSlashIndex + 1, len);
    }

    /**
     * Returns the parent URL of the given URL, or <code>null</code> if the
     * given URL is the root.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Parent URL</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>null</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>"http://hostname/folder/</td>
     * </table>
     *
     * @param url a URL
     * @return    the parent of the given URL
     * @throws    MalformedURLException if the given URL is malformed
     */
    public static URL getParent(String url) throws MalformedURLException {
        return getParent(new URL(url));
    }

    /**
     * Returns the parent URL of the given URL, or <code>null</code> if the
     * given URL is the root.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Parent URL</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>null</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>"http://hostname/folder/</td>
     * </table>
     *
     * @param url a URL
     * @return    the parent of the given URL
     */
    public static URL getParent(URL url) {
        String file = url.getFile();
        int len = file.length();

        if (len == 0 || len == 1 && file.charAt(0) == '/')
            return null;

        int lastSlashIndex = -1;
        for (int i = len - 2; lastSlashIndex == -1 && i >= 0; --i) {
            if (file.charAt(i) == '/')
                lastSlashIndex = i;
        }

        if (lastSlashIndex == -1)
            file = ""; //$NON-NLS-1$
        else
            file = file.substring(0, lastSlashIndex + 1);

        try {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), file);
        } catch (MalformedURLException e) {
            Assert.isTrue(false, e.getMessage());
        }

        return url;
    }

    /**
     * Returns the root URL of the given URL.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Root URL</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>"http://hostname/"</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>"http://hostname/"</td>
     * </table>
     *
     * @param urlString a URL
     * @return          the root url of the given URL
     * @throws          MalformedURLException if the given URL is malformed
     */
    public static URL getRoot(String urlString) throws MalformedURLException {
        return getRoot(new URL(urlString));
    }

    /**
     * Returns the root URL of the given URL.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Root URL</th>
     * <tr>
     *   <td>"http://hostname/"</td>
     *   <td>"http://hostname/"</td>
     * <tr>
     *   <td>"http://hostname/folder/file</td>
     *   <td>"http://hostname/"</td>
     * </table>
     *
     * @param url a URL
     * @return    the root URL of the given URL
     */
    public static URL getRoot(URL url) {
        try {
            return new URL(url.getProtocol(), url.getHost(), url.getPort(), "/"); //$NON-NLS-1$
        } catch (MalformedURLException e) {
            Assert.isTrue(false, Policy.bind("assert.internalError")); //$NON-NLS-1$
        }
        return null;
    }

    /**
     * Returns the given URL with its trailing slash removed. If the URL has
     * no trailing slash, the URL is returned unchanged.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Returned URL</th>
     * <tr>
     *   <td>"http://hostname/folder"</td>
     *   <td>"http://hostname/folder"</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>"http://hostname/folder"</td>
     * </table>
     *
     * @param url a URL
     * @return    the given URL with its last slash removed
     * @throws    MalformedURLException if the given URL is malformed
     */
    public static URL removeTrailingSlash(String url) throws MalformedURLException {
        return removeTrailingSlash(new URL(url));
    }

    /**
     * Returns the given URL with its trailing slash removed. If the URL has
     * no trailing slash, the URL is returned unchanged.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>Given URL</th>
     *   <th>Returned URL</th>
     * <tr>
     *   <td>"http://hostname/folder"</td>
     *   <td>"http://hostname/folder"</td>
     * <tr>
     *   <td>"http://hostname/folder/</td>
     *   <td>"http://hostname/folder"</td>
     * </table>
     *
     * @param url a URL
     * @return    the given URL with its last slash removed
     */
    public static URL removeTrailingSlash(URL url) {
        String file = url.getFile();

        if (file.endsWith("/")) { //$NON-NLS-1$
            file = file.substring(0, file.length() - 1);
            try {
                return new URL(url.getProtocol(), url.getHost(), url.getPort(), file);
            } catch (MalformedURLException e) {
                Assert.isTrue(false, e.getMessage());
            }
        } else {
            return url;
        }

        return null;
    }

    /**
     * Returns a boolean indicating whether the given URLs overlap.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>First URL</th>
     *   <th>Second URL</th>
     *   <th>Do they overlap</th>
     * <tr>
     *   <td>"http://hostname/folder/"</td>
     *   <td>"http://hostname/folder/"</td>
     *   <td>true</td>
     * <tr>
     *   <td>"http://hostname/folder/"</td>
     *   <td>"http://hostname/folder/file"</td>
     *   <td>true</td>
     * <tr>
     *   <td>"http://hostname/folder/file"</td>
     *   <td>"http://hostname/folder/"</td>
     *   <td>true</td>
     * <tr>
     *   <td>"http://hostname/folder1/"</td>
     *   <td>"http://hostname/folder2/"</td>
     *   <td>false</td>
     * </table>
     * @param  url1 firt URL
     * @param  url2 second URL
     * @return a boolean indicating whether the given URLs overlap
     */
    public static boolean urlsOverlap(String url1, String url2) throws MalformedURLException {
        return urlsOverlap(new URL(url1), new URL(url2));
    }

    /**
     * Returns a boolean indicating whether the given URLs overlap.
     * <table>
     * <caption>Example</caption>
     * <tr>
     *   <th>First URL</th>
     *   <th>Second URL</th>
     *   <th>Do they overlap</th>
     * <tr>
     *   <td>"http://hostname/folder/"</td>
     *   <td>"http://hostname/folder/"</td>
     *   <td>true</td>
     * <tr>
     *   <td>"http://hostname/folder/"</td>
     *   <td>"http://hostname/folder/file"</td>
     *   <td>true</td>
     * <tr>
     *   <td>"http://hostname/folder/file"</td>
     *   <td>"http://hostname/folder/"</td>
     *   <td>true</td>
     * <tr>
     *   <td>"http://hostname/folder1/"</td>
     *   <td>"http://hostname/folder2/"</td>
     *   <td>false</td>
     * <tr>
     *   <td>"http://hostname1/folder/"</td>
     *   <td>"http://hostname2/folder/"</td>
     *   <td>false</td>
     * </table>
     * @param  url1 firt URL
     * @param  url2 second URL
     * @return a boolean indicating whether the given URLs overlap
     */
    public static boolean urlsOverlap(URL url1, URL url2) {
        if (!getRoot(url1).equals(getRoot(url2))) {
            return false;
        }
        Vector elements1 = URLTool.getElements(url1);
        Vector elements2 = URLTool.getElements(url2);
        for (int i = 0; i < elements1.size() && i < elements2.size(); ++i) {
            String element1 = (String) elements1.elementAt(i);
            String element2 = (String) elements2.elementAt(i);
            if (!element1.equals(element2)) {
                return false;
            }
        }
        return true;
    }
}
