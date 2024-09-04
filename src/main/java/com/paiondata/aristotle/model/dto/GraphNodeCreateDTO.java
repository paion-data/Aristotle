package com.paiondata.aristotle.model.dto;

import com.paiondata.aristotle.common.base.Message;
import com.paiondata.aristotle.model.BaseEntity;
import lombok.Data;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
public class GraphNodeCreateDTO extends BaseEntity {

    @NotBlank(message = Message.UUID_MUST_NOT_BE_BLANK)
    private String graphUuid;

    @Valid
    private List<GraphNodeDTO> graphNodeDTO;

    private List<GraphNodeExistRelationDTO> graphNodeExistRelationDTO;

    private List<GraphNodeTemporaryRelationDTO> graphNodeTemporaryRelationDTO;
}