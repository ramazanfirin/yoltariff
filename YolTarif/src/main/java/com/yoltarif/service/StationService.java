package com.yoltarif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Box;
import org.springframework.data.geo.Shape;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;

import com.yoltarif.model.Station;
import com.yoltarif.repository.StationRepository;

@Service
public class StationService {
	
	
	
	
	@Autowired(required=true)
	public StationRepository stationRepository;
	
	
	
	public void save(Station object){
		stationRepository.save(object);
	}
	
	public void findWithinBoundingBox(String indexName,Box box){
		stationRepository.findWithinBoundingBox(indexName, box);
	}

	public Result<Station> findWithinDistance(String indexName,double lat,double lng,double distanceKM){
		return stationRepository.findWithinDistance(indexName, lat, lng, distanceKM);
	}
	
	public void findWithinShape(String indexName,Shape shape){
		stationRepository.findWithinShape(indexName, shape);
	}

	public void findWithinWellKnownText(String indexName,String wellKnownText){
		stationRepository.findWithinWellKnownText(indexName, wellKnownText);
	}
}

