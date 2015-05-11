package com.yoltarif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Service;

import com.yoltarif.model.Line;
import com.yoltarif.repository.LineRepository;

@Service
public class LineService {
	
	@Autowired(required=true)
	public LineRepository lineRepository;
	
	public void save(Line object){
		lineRepository.save(object);
	}

	public void clearDatabase(){
		lineRepository.deleteAllNodes();
		lineRepository.deleteAllRelations();
	}

}
