package com.yoltarif.model;


import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;
import org.springframework.data.neo4j.support.index.IndexType;

@NodeEntity
@TypeAlias(value="Station")
public class Station extends AbstractEntity{

	String name;
	
	 
	@Indexed(indexType = IndexType.POINT, indexName = "location") 
	String wkt;
	
	
	String orijinalwkt;


	@RelatedTo(type="contains",direction = Direction.INCOMING)
	Line line;
	
	@RelatedToVia(type = "next",direction = Direction.OUTGOING)
	Station nextStation;
	
	@RelatedToVia(type = "next",direction = Direction.INCOMING)
	Station previousStation;
	
	public Station getNextStation() {
		return nextStation;
	}

	public void setNextStation(Station nextStation) {
		this.nextStation = nextStation;
	}

	
	public Station getPreviousStation() {
		return previousStation;
	}

	public void setPreviousStation(Station previousStation) {
		this.previousStation = previousStation;
	}

	
	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public void setWkt(String wkt) {
		this.wkt = wkt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWkt() {
		return wkt;
	}

	public void setWkt(float lon, float lat) {
		this.wkt =String.format("POINT( %f %f )",lon,lat);
	}

	public String getOrijinalwkt() {
		return orijinalwkt;
	}

	public void setOrijinalwkt(float lon, float lat) {
		this.orijinalwkt = String.format("POINT( %.2f %.2f )",lon,lat);
	}

}
