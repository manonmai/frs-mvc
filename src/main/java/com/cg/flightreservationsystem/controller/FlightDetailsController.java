package com.cg.flightreservationsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightreservationsystem.dto.FlightDTO;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.FlightDetailOperations;

/**
 * Controller for flightDetails
 * 
 * @author seeta
 *
 */
@RestController
@RequestMapping(value = "/flight")
public class FlightDetailsController {
	@Autowired
	FlightDetailOperations flightDetailOperations;

	public void setFlightDetailOperations(FlightDetailOperations flightDetailOperations) {
		this.flightDetailOperations = flightDetailOperations;
	}

	/**
	 * to view list of flights
	 * 
	 * @return flightList
	 */
	@RequestMapping(value = "/viewDetails", method = RequestMethod.GET, produces = "application/json")
	public List<FlightDTO> viewFlightDetails() {
		List<FlightDTO> flightList = new ArrayList<FlightDTO>();
		try {
			flightList = flightDetailOperations.viewFlightDetails();
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return flightList;

	}

	/**
	 * to modify capacity
	 * 
	 * @param Flightdto
	 * @return boolean
	 */
	@RequestMapping(value = "/modifyCapacity", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyCapacity(@RequestBody FlightDTO dto) {
		boolean flag = false;
		try {
			flag = flightDetailOperations.modifyFlightDetails(dto);
			flag = true;
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return flag;

	}

}
