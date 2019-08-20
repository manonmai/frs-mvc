package com.cg.flightreservationsystem.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightreservationsystem.dao.FlightDetailDao;
import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.FlightDetailOperations;
import com.cg.flightreservationsystem.utility.Validation;
/**
 * Service class for flight detail operations
 * @author seeta
 *
 */

@Service
public class FlightDetailOperationsImpl implements FlightDetailOperations {
	@Autowired
	 FlightDetailDao daoImpl;
	Validation validate = new Validation();
	 public void setDaoImpl(FlightDetailDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	/**
	  * service method to modify flight details
	  */
	public boolean modifyFlightDetails(FlightDTO flight) throws  FRSException {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
			if(daoImpl.modifyCapacity(flight)) {
				flag=true;
			}
		return flag;
	}
	/**
	 * service method to view flight details
	 */

	public List<FlightDTO> viewFlightDetails() throws  FRSException
	{
		// TODO Auto-generated method stub
		List<FlightDTO>flightList;
		flightList=(daoImpl.getFlightList());
		return flightList;
		}

}
