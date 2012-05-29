/**
 * Copyright (C) 2011 Hippo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onehippo.forge.rewriting;

import javax.jcr.Item;
import javax.jcr.RepositoryException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version $Id$
 */
public class UrlRewriteUtils {

    private static Logger log = LoggerFactory.getLogger(UrlRewriteUtils.class);

    /**
     * JCR item path getter
     *
     * @param item JCR item
     * @return Path (nullable)
     */
    public static String getJcrItemPath(Item item) {
        if (item == null) {
            return null;
        }
        try {
            return item.getPath();
        } catch (RepositoryException e) {
            log.warn(e.getMessage());
            return null;
        }
    }
}