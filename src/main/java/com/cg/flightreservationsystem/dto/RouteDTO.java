package com.cg.flightreservationsystem.dto;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;





@Entity
@Table(name = "route")
public class RouteDTO implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROUTE_SEQ")
	@SequenceGenerator(name = "ROUTE_SEQ", sequenceName = "route_seq")
	@Column(name = "route_id",updatable = false, nullable = false)
	private int routeId;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	/**
	 * @return the routeId
	 */
	public int getRouteId() {
		return routeId;
	}


	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}


	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "routeId=" + routeId + ", source=" + source + ", destination=" + destination;
	}

	
	
	
}

	
	