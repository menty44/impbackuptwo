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

package org.drools.eclipse.util;

import java.util.ArrayList;
import java.util.List;

import org.drools.eclipse.DroolsEclipsePlugin;
import org.drools.eclipse.preferences.IDroolsConstants.InternalApiChoice;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathAccessRule;
import org.eclipse.jdt.internal.core.ClasspathEntry;

public class DroolsClasspathContainer implements IClasspathContainer {

    public static final IPath DROOLS_CLASSPATH_CONTAINER_PATH = new Path("DROOLS/Drools");
    IClasspathEntry droolsLibraryEntries[];
    IPath path;
    IJavaProject javaProject;

    public DroolsClasspathContainer(IJavaProject project) {
    	this(project, DROOLS_CLASSPATH_CONTAINER_PATH);
    }
    
    public DroolsClasspathContainer(IJavaProject project, IPath path) {
        javaProject = null;
        javaProject = project;
        this.path = path;
    }

    public static boolean hasDroolsClasspath(IJavaProject project) {
    	IClasspathEntry[] classpathEntries;
		try {
			classpathEntries = project.getRawClasspath();
	    	for (int i = 0; i < classpathEntries.length; i++) {
	    		if (DROOLS_CLASSPATH_CONTAINER_PATH.equals(classpathEntries[i].getPath().toString())) {
	    			return true;
	    		}
	    	}
		}
		catch (JavaModelException e) {
            DroolsEclipsePlugin.log(e);
		}
    	return false;
    }
    
    @Override
	public IClasspathEntry[] getClasspathEntries() {
        if (droolsLibraryEntries == null) {
            droolsLibraryEntries = createDroolsLibraryEntries(javaProject);
        }
        return droolsLibraryEntries;
    }

    @Override
	public String getDescription() {
        return "Drools Library";
    }

    @Override
	public int getKind() {
        return 1;
    }

    @Override
	public IPath getPath() {
        return path;
    }

    private IClasspathEntry[] createDroolsLibraryEntries(IJavaProject project) {
        InternalApiChoice internalAPI = InternalApiChoice.getPreferenceChoice();
        String[] jarNames = getJarNames(project);
        List<IClasspathEntry> list = new ArrayList<IClasspathEntry>();
        if (jarNames != null) {
            for (int i = 0; i < jarNames.length; i++) {
                Path path = new Path(jarNames[i]);
                if (jarNames[i].contains("knowledge-api") || (jarNames[i].contains("kie-api"))) {
                    list.add(JavaCore.newLibraryEntry(path, path, null));
                } else {
                    IAccessRule[] accessRules = new IAccessRule[1];
                    accessRules[0] = new ClasspathAccessRule(new Path("**"), internalAPI.getAccessRule());
                    list.add(JavaCore.newLibraryEntry(
                        path, path, null, accessRules, ClasspathEntry.NO_EXTRA_ATTRIBUTES, false));
                }
            }
        }
        return (IClasspathEntry[]) list.toArray(new IClasspathEntry[list.size()]);
    }

    private String[] getJarNames(IJavaProject project) {
        return DroolsRuntimeManager.getDefault().getRuntimeJars(project.getProject());
    }

}
