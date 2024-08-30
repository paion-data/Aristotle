package com.paiondata.aristotle.repository;

import com.paiondata.aristotle.model.entity.GraphNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface GraphNodeRepository extends Neo4jRepository<GraphNode, Long> {

    @Query("MATCH (gn:GraphNode { title: $title }) RETURN gn")
    GraphNode getGraphNodeByTitle(String title);

    @Query("MATCH (gn:GraphNode { uuid: $uuid }) RETURN gn")
    GraphNode getGraphNodeByUUID(String UUID);

    @Query("MATCH (gn:GraphNode { title: $title, description: $description }) RETURN count(gn)")
    long checkGraphNodeExists(@Param("title") String title,
                          @Param("description") String description);

    @Query("CREATE (gn:GraphNode { title: $title, description: $description, uuid: $uuid update_time: $updateTime }) "
            + "RETURN gn")
    GraphNode createGraphNode(@Param("title") String title,
                      @Param("description") String description,
                      @Param("uuid") String uuid,
                      @Param("updateTime") Date updateTime);

    @Query("MATCH (g:Graph) WHERE g.uuid = $graphUuid "
            + "MATCH (gn:GraphNode) "
            + "WHERE gn.uuid = $graphNodeUuid with g,gn"
            + " CREATE (g)-[r:HAVE]->(gn)")
    void bindGraphToGraphNode(@Param("graphUuid") String graphUuid,
                              @Param("graphNodeUuid") String graphNodeUuid);

    @Query("MATCH (gn1:GraphNode) WHERE gn1.uuid = $uuid1 "
            + "MATCH (gn2:GraphNode) WHERE gn2.uuid = $uuid2 "
            + "WITH gn1,gn2 "
            + "CREATE (gn1)-[r:RELATION{name: $relation}]->(gn2)")
    void bindGraphNodeToGraphNode(@Param("uuid1") String uuid1,
                                  @Param("uuid2") String uuid2,
                                  @Param("relation") String relation);

    @Query("MATCH (gn:GraphNode) WHERE gn.UUID IN $UUIDs DETACH DELETE gn")
    void deleteByUUIDs(List<String> UUIDs);
}
