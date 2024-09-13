package com.paiondata.aristotle.controller;

import com.paiondata.aristotle.common.base.Message;
import com.paiondata.aristotle.common.base.Result;
import com.paiondata.aristotle.model.dto.BindNodeDTO;
import com.paiondata.aristotle.model.dto.GraphAndNodeCreateDTO;
import com.paiondata.aristotle.model.dto.GraphUpdateDTO;
import com.paiondata.aristotle.model.dto.NodeCreateDTO;
import com.paiondata.aristotle.model.entity.GraphNode;
import com.paiondata.aristotle.service.GraphNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/node")
public class GraphNodeController {

    @Autowired
    private GraphNodeService graphNodeService;

    @GetMapping("/{uuid}")
    public Result<GraphNode> getNodeByUuid(
            @PathVariable @NotBlank(message = Message.UUID_MUST_NOT_BE_BLANK) String uuid) {
        Optional<GraphNode> optionalGraphNode = graphNodeService.getNodeByUuid(uuid);
        return optionalGraphNode.map(Result::ok).orElseGet(() -> Result.fail(Message.GRAPH_NODE_NULL));
    }

    @PostMapping
    public Result<String> createAndBindNode(@RequestBody @Valid NodeCreateDTO graphNodeCreateDTO) {
        graphNodeService.createAndBindGraphAndNode(graphNodeCreateDTO);
        return Result.ok(Message.CREATE_SUCCESS);
    }

    @PostMapping("/graph")
    public Result<String> createGraphAndBindGraphAndNode(@RequestBody @Valid GraphAndNodeCreateDTO graphNodeCreateDTO) {
        graphNodeService.createGraphAndBindGraphAndNode(graphNodeCreateDTO);
        return Result.ok(Message.CREATE_SUCCESS);
    }

    @PostMapping("/bind")
    public Result<String> bindNodes(@RequestBody @Valid BindNodeDTO bindGraphNodeDTO) {
        graphNodeService.bindNodes(bindGraphNodeDTO.getFromId(),
                bindGraphNodeDTO.getToId(), bindGraphNodeDTO.getRelationName());
        return Result.ok(Message.BOUND_SUCCESS);
    }

    @PutMapping
    public Result<String> updateNode(@RequestBody GraphUpdateDTO graphUpdateDTO) {
        graphNodeService.updateNode(graphUpdateDTO);
        return Result.ok(Message.UPDATE_SUCCESS);
    }

    @DeleteMapping
    public Result<String> deleteNode(@RequestBody @NotEmpty(message = Message.UUID_MUST_NOT_BE_BLANK)
                                      List<String> uuids) {
        graphNodeService.deleteByUuids(uuids);
        return Result.ok(Message.DELETE_SUCCESS);
    }
}
