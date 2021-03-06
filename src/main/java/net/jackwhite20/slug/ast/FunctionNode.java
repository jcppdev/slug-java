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

import java.util.List;

/**
 * @author Philip 'JackWhite20' <silencephil@gmail.com>
 */
public class FunctionNode extends Node {

    private String name;

    private BlockNode children;

    private List<Node> parameter;

    public FunctionNode(String name, BlockNode block, List<Node> parameter) {
        this.name = name;
        this.children = block;
        this.parameter = parameter;
    }

    public String getName() {
        return name;
    }

    public BlockNode getBlock() {
        return children;
    }

    public List<Node> getParameter() {
        return parameter;
    }
}
