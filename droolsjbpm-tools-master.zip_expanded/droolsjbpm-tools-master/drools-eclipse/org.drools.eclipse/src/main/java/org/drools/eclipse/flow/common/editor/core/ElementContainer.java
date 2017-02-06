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

package org.drools.eclipse.flow.common.editor.core;

import java.util.List;

public interface ElementContainer {
    
    void addElement(ElementWrapper element);
    
    void localAddElement(ElementWrapper element);
    
    void removeElement(ElementWrapper element);
    
    List<ElementWrapper> getElements();
    
    ProcessWrapper getProcessWrapper();
    
    boolean canAddElement(ElementWrapper element);

}
