/*
 * Copyright 2005 Red Hat, Inc. and/or its affiliates.
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

package org.drools.eclipse.flow.ruleflow.view.property.constraint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.drools.eclipse.editors.DRLRuleEditor;
import org.drools.eclipse.editors.completion.RuleCompletionProcessor;
import org.drools.compiler.lang.descr.GlobalDescr;
import org.drools.core.process.core.datatype.DataType;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.jbpm.process.core.context.variable.Variable;
import org.jbpm.process.core.context.variable.VariableScope;
import org.jbpm.workflow.core.WorkflowProcess;

/**
 * Completion for ruleflow constraints.
 */
public class ConstraintCompletionProcessor extends RuleCompletionProcessor {

    private WorkflowProcess process;
    private List<String> imports;
    private List<GlobalDescr> globals;
    private String type;

    public ConstraintCompletionProcessor(WorkflowProcess process) {
        super(null);
        this.process = process;
    }

    public IEditorPart getEditor() {
        IWorkbench workbench = PlatformUI.getWorkbench();
        if (workbench != null) {
            IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
            if (workbenchWindow != null) {
                IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
                if (workbenchPage != null) {
                    return workbenchPage.getActiveEditor();
                }
            }
        }
        return null;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected String readBackwards(int documentOffset, IDocument doc) throws BadLocationException {
        int startPart = doc.getPartition(documentOffset).getOffset();
        String prefix = doc.get(startPart, documentOffset - startPart);
        if ("code".equals(type)) {
            if (prefix.startsWith("return ")) {
                prefix = prefix.substring(7);
            }
            String result = "rule dummy when eval( ";
            VariableScope variableScope = (VariableScope) process.getDefaultContext(VariableScope.VARIABLE_SCOPE);
            if (variableScope != null) {
                for (Variable variable: variableScope.getVariables()) {
                    DataType type = variable.getType();
                    result +=  type.getStringType() + " " + variable.getName() + "; ";
                }
            }
            return result + prefix;
        } else {
            return "rule dummy \n when \n" + prefix;
        }
    }

    public List<String> getImports() {
        if (imports == null) {
            loadImports();
        }
        return imports;
    }

    private void loadImports() {
        this.imports = new ArrayList<String>();
        Set<String> imports = ((org.jbpm.process.core.Process) process).getImports();
        if (imports != null) {
            Iterator<String> iterator = imports.iterator();
            while (iterator.hasNext()) {
                String importName = iterator.next();
                if (importName.endsWith(".*")) {
                    IJavaProject javaProject = getJavaProject();
                    if (javaProject != null) {
                        String packageName = importName.substring(0, importName.length() - 2);
                        this.imports.addAll(DRLRuleEditor.getAllClassesInPackage(packageName, javaProject));
                    }
                } else {
                    this.imports.add(importName);
                }
            }
        }
    }

    public List<GlobalDescr> getGlobals() {
        if (globals == null) {
            loadGlobals();
        }
        return globals;
    }

    private void loadGlobals() {
        String[] globalNames = process.getGlobalNames();
        this.globals = new ArrayList<GlobalDescr>(globalNames.length);
        for (String globalName: globalNames) {
            this.globals.add(new GlobalDescr(globalName, "java.lang.Object"));
        }
    }

    private IJavaProject getJavaProject() {
        IEditorPart editor = getEditor();
        if (editor != null && editor.getEditorInput() instanceof IFileEditorInput) {
            IFile file = ((IFileEditorInput) editor.getEditorInput()).getFile();
            try {
                if (file.getProject().getNature("org.eclipse.jdt.core.javanature") != null) {
                    return JavaCore.create(file.getProject());
                }
            } catch (CoreException e) {
                // do nothing
            }
        }
        return null;
    }

    public void reset() {
        this.imports = null;
        this.globals = null;
    }
}
