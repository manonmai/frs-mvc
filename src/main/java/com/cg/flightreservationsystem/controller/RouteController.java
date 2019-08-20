package com.cg.flightreservationsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.FlightRouteOperations;

/**
 * Controller for route
 * 
 * @author seeta
 *
 */
@RestController
@RequestMapping(value = "/route")
public class RouteController {

	@Autowired
	FlightRouteOperations routeOperations;

	public void setRouteOperations(FlightRouteOperations routeOperations) {
		this.routeOperations = routeOperations;
	}

	/**
	 * to view routes
	 * 
	 * @return
	 */
	@RequestMapping(value = "/viewlist", method = RequestMethod.GET, produces = "application/json")
	public List<RouteDTO> viewRouteDetails() {
		List<RouteDTO> routeList = new ArrayList<RouteDTO>();
		try {
			routeList = routeOperations.viewRouteDetails();
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return routeList;
	}

	/**
	 * to modify source
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/modifySource", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifySource(@RequestBody RouteDTO dto) {

		boolean flag = false;
		try {
			flag = routeOperations.modifySource(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return flag;

	}

	/**
	 * to modify destination
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/modifyDestination", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyDestination(@RequestBody RouteDTO dto) {
		boolean flag = false;
		try {
			flag = routeOperations.modifyDestination(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return flag;

	}

}
