package com.cg.flightreservationsystem.dao;


import java.util.List;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.exception.FRSException;
/**
 * Interface for Flight detatails dao
 * @author seeta
 *
 */
public interface FlightDetailDao 
{
	public List<FlightDTO> getFlightList() throws FRSException;
	
	boolean modifyCapacity(FlightDTO flight) throws FRSException;

	

	

}
