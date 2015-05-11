package com.yoltarif.model;

import java.util.ArrayList;
import java.util.List;

public class DisjktraDTO {

	String startNodeId;
	String endNodeId;
	Double weigth;
	
	List<String> nodeIdList= new ArrayList<String>();
	List<String> relationIdList= new ArrayList<String>();
	public String getStartNodeId() {
		return startNodeId;
	}
	public void setStartNodeId(String startNodeId) {
		this.startNodeId = startNodeId;
	}
	public String getEndNodeId() {
		return endNodeId;
	}
	public void setEndNodeId(String endNodeId) {
		this.endNodeId = endNodeId;
	}
	
	
	public List<String> getRelationIdList() {
		return relationIdList;
	}
	public void setRelationIdList(List<String> relationIdList) {
		this.relationIdList = relationIdList;
	}
	public Double getWeigth() {
		return weigth;
	}
	public void setWeigth(Double weigth) {
		this.weigth = weigth;
	}
	public List<String> getNodeIdList() {
		return nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
	}
}
