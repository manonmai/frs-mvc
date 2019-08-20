package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.FRSException;
/**
 * interface for route details
 * @author seeta
 *
 */
public interface FlightRouteOperations {

	public boolean modifyDestination(RouteDTO route) throws  FRSException;
	public  List<RouteDTO> viewRouteDetails() throws FRSException;
	public boolean modifySource(RouteDTO route) throws FRSException;
}
