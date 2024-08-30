package com.paiondata.aristotle.model.dto;

import com.paiondata.aristotle.common.base.Message;
import com.paiondata.aristotle.model.BaseEntity;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BindGraphNodeDTO extends BaseEntity {

    @NotBlank(message = Message.UUID_MUST_NOT_BE_BLANK)
    private String uuid1;

    @NotBlank(message = Message.UUID_MUST_NOT_BE_BLANK)
    private String uuid2;

    @NotBlank(message = Message.RELATION_MUST_NOT_BE_BLANK)
    private String relation;
}