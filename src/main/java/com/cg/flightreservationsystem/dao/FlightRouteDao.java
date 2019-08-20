package com.cg.flightreservationsystem.dao;

import java.util.List;

import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.FRSException;
/**
 * Interface for route dao
 * @author seeta
 *
 */
public interface FlightRouteDao  {

	List<RouteDTO> getRouteList() throws FRSException;

	boolean modifySource(RouteDTO route) throws FRSException;

	

	boolean modifyDestination(RouteDTO route) throws FRSException;

}
