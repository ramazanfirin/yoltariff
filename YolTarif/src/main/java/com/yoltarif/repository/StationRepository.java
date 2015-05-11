package com.yoltarif.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.SpatialRepository;

import com.yoltarif.model.Station;



public interface StationRepository extends GraphRepository<Station>,SpatialRepository<Station>{

	@Query("start n=node(*) where n.name={0} return n")
    public List<Station> searchByName(String serviceName);
	
	
		
}

