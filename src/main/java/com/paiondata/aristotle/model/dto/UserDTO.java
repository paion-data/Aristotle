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

import com.paiondata.aristotle.common.base.Message;
import com.paiondata.aristotle.model.BaseEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * Data Transfer Object (DTO) for the user.
 *
 * This DTO is used to encapsulate the data required for the user.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Data Transfer Object for the user.")
public class UserDTO extends BaseEntity {

    /**
     * The unique identifier (UID/CID) of the user.
     *
     * @see Message#UIDCID_MUST_NOT_BE_BLANK
     */
    @ApiModelProperty(value = "The unique identifier (UID/CID) of the user.", required = true)
    @NotBlank(message = Message.UIDCID_MUST_NOT_BE_BLANK)
    private String uidcid;

    /**
     * The nickname of the user.
     *
     * @see Message#NICK_NAME_MUST_NOT_BE_BLANK
     */
    @ApiModelProperty(value = "The nickname of the user.", required = true)
    @NotBlank(message = Message.NICK_NAME_MUST_NOT_BE_BLANK)
    private String nickName;
}
