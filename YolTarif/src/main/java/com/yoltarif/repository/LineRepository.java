package com.yoltarif.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.yoltarif.model.Line;

public interface LineRepository extends GraphRepository<Line>{

	@Query("START n = node(*) DELETE n")
    public void deleteAllNodes();
	
	@Query("START n = rel(*)  DELETE n")
    public void deleteAllRelations();
}
