/*
 * Copyright 2015 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.kernel.api.exception;

/**
 * A transaction was not found in the transaction registry
 *
 * @author awoods
 */
public class SessionMissingException extends RepositoryRuntimeException {

    private static final long serialVersionUID = 2139084821001303830L;

    /**
     *
     * @param s the exception message
     */
    public SessionMissingException(final String s) {
        super(s);
    }
}