/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2019-2023 Andres Almiray.
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
package org.kordamp.gradle.plugin.buildcache

import groovy.transform.CompileStatic
import org.gradle.caching.BuildCacheEntryReader
import org.gradle.caching.BuildCacheEntryWriter
import org.gradle.caching.BuildCacheException
import org.gradle.caching.BuildCacheKey
import org.gradle.caching.BuildCacheService

/**
 * @author Andres Almiray
 * @since 0.10.0
 */
@CompileStatic
class NoopBuildCacheService implements BuildCacheService {
    @Override
    boolean load(BuildCacheKey buildCacheKey, BuildCacheEntryReader buildCacheEntryReader) throws BuildCacheException {
        // noop
        return false
    }

    @Override
    void store(BuildCacheKey buildCacheKey, BuildCacheEntryWriter buildCacheEntryWriter) throws BuildCacheException {
        // noop
    }

    @Override
    void close() throws IOException {
        // noop
    }
}
