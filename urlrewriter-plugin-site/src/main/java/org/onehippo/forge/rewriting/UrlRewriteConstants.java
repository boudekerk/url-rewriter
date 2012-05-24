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

/**
 * @version $Id$
 */
public class UrlRewriteConstants {

    public static final String PRIMARY_TYPE_RULE = "urlrewriter:rule";
    public static final String PRIMARY_TYPE_RULESET = "urlrewriter:ruleset";
    public static final String PRIMARY_TYPE_RULESETXML = "urlrewriter:rulesetxml";
    public static final String PRIMARY_TYPE_SIMPLEFOLDER = "urlrewriter:simplefolder";
    public static final String PRIMARY_TYPE_SIMPLERULE = "urlrewriter:simplerule";

    public static final String FROM_PROPERTY = "urlrewriter:rulefrom";
    public static final String TO_PROPERTY = "urlrewriter:ruleto";
    public static final String TYPE_PROPERTY = "urlrewriter:ruletype";
    public static final String CASE_SENSITIVE_PROPERTY = "urlrewriter:casesensitive";
    public static final String NAME_PROPERTY = "urlrewriter:rulename";
    public static final String DESCRIPTION_PROPERTY = "urlrewriter:ruledescription";
    public static final String AND_OR_PROPERTY = "urlrewriter:conditionor";
    public static final String CONDITION_PREDEFINED_NAME_PROPERTY = "urlrewriter:conditionpredefinedname";
    public static final String CONDITION_NAME_PROPERTY = "urlrewriter:conditionname";
    public static final String CONDITION_VALUE_PROPERTY = "urlrewriter:conditionvalue";
    public static final String CONDITION_TYPE_PROPERTY = "urlrewriter:conditiontype";
    public static final String CONDITION_OPERATOR_PROPERTY = "urlrewriter:conditionoperator";


    public static final String XML_START = "<?xml version=\"1.0\" encoding=\"utf-8\"?><urlrewrite>";
    public static final String XML_END = "</urlrewrite>";
}