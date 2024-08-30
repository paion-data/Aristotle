package com.paiondata.aristotle.service;

import com.paiondata.aristotle.model.dto.GraphCreateDTO;
import com.paiondata.aristotle.model.entity.GraphNode;

import java.util.List;
import java.util.Optional;

public interface GraphNodeService {

    Optional<GraphNode> getGraphNodeByTitle(String title);

    Optional<GraphNode> getGraphNodeByUuid(String uuid);

    void createGraphNode(GraphCreateDTO graphCreateDTO);

    void bindGraph(String graphUuid, String graphNodeUuid);

    void bindGraphNode(String uuid1, String uuid2, String relation);

    void deleteByUuids(List<String> uuids);
}
