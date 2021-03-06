/*
 * Copyright 2018 "JackWhite20"
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

package net.jackwhite20.slug.ast;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VariableAssignNodeTest {

    private static final String VARIABLE_NAME = "a";

    private static final Node RIGHT = new StringNode("slug");

    @Test
    public void testVariableAssignNode() {
        VariableAssignNode variableAssignNode = new VariableAssignNode(VARIABLE_NAME, RIGHT);

        assertEquals(VARIABLE_NAME, variableAssignNode.getVariableName());
        assertEquals(RIGHT, variableAssignNode.getRight());
    }
}