/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package org.deeplearning4j.nn.conf.module;

import org.deeplearning4j.nn.conf.ComputationGraphConfiguration;

/**
 * GraphBuilderModule for nn layers. Allows for creation of plugins and modules to generate configurations and layers.
 *
 * @author Justin Long (crockpotveggies)
 */
public abstract class GraphBuilderModule {

    /**
     * A module should return its name. Useful for automatically generating layer names.
     *
     * @note Convention is to define module names that are entirely lowercase for the purpose of generating layer names.
     *
     * @return The module name as a string.
     */
    public abstract String getModuleName();

    /**
     * Add a layer to the collection of layers being generated by this module.
     *
     * @param graph
     * @param layerName
     * @param inputSize
     * @param config
     * @param inputLayer
     *
     * @return An instance of GraphBuilder with appended layers.
     */
    public abstract ComputationGraphConfiguration.GraphBuilder updateBuilder(ComputationGraphConfiguration.GraphBuilder graph, String layerName, int inputSize, int[][] config, String inputLayer);


}
