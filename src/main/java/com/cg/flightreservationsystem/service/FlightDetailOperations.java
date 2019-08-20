package com.cg.flightreservationsystem.service;

import java.util.List;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.exception.FRSException;
/**
 * Interface for flight operations
 * @author seeta
 *
 */
public interface FlightDetailOperations {
	public boolean modifyFlightDetails(FlightDTO flight)throws FRSException;
	public List<FlightDTO> viewFlightDetails()throws  FRSException;
	
	

}
