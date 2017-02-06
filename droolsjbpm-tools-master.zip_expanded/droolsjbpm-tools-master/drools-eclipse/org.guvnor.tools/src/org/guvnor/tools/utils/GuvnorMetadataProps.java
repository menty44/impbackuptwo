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

package org.guvnor.tools.utils;
/**
 * Model for properties associated with Guvnor resources.
 */
public class GuvnorMetadataProps {
    private String filename;
    private String repository;
    private String fullpath;
    private String version;
    private String revision;

    public GuvnorMetadataProps(String filename, String repository,
                              String fullpath, String version, String revision) {
        this.filename = filename;
        this.repository = repository;
        this.fullpath = fullpath;
        this.version = version;
        this.revision = revision;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getRepository() {
        return repository;
    }
    public void setRepository(String repository) {
        this.repository = repository;
    }
    public String getFullpath() {
        return fullpath;
    }
    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getRevision() {
        return revision;
    }
    public void setRevision(String revision) {
        this.revision = revision;
    }
}
