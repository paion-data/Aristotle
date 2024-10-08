/*
 * Copyright 2024 Paion Data
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
package com.paiondata.aristotle.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Data Transfer Object (DTO) for creating graph and node.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Data Transfer Object (DTO) for creating graph and node.")
public class GraphNodeDTO {

    /**
     * The uuid of the graph.
     */
    @ApiModelProperty(value = "The uuid of the graph.")
    private String uuid;

    /**
     * The title of the graph.
     */
    @ApiModelProperty(value = "The title of the graph.")
    private String title;

    /**
     * The description of the graph.
     */
    @ApiModelProperty(value = "The description of the graph.")
    private String description;

    /**
     * The list of nodes in the graph.
     */
    @ApiModelProperty(value = "The list of nodes in the graph.")
    private List<NodeReturnDTO> nodes;
}
