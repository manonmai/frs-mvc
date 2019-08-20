package com.cg.flightreservationsystem.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightreservationsystem.dao.FlightRouteDao;
import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.FlightRouteOperations;
import com.cg.flightreservationsystem.utility.Validation;
/**
 * service class to perform flight route operations
 * @author seeta
 *
 */
@Service
public class FlightRouteOperationsImpl implements FlightRouteOperations{
	@Autowired
	FlightRouteDao dao;
	Validation validate = new Validation();

	/**
	 * service method to modify source
	 */
	public boolean modifySource(RouteDTO route) throws FRSException
	{
	    validate.isPlaceValid(route.getSource());
			return dao.modifySource(route);

	}
	public void setDaoImpl(FlightRouteDao daoImpl) {
		this.dao = daoImpl;
	}
	/**
	 * service method to modify destination
	 */
	public boolean modifyDestination(RouteDTO route) throws FRSException
	{
		validate.isPlaceValid(route.getDestination());
		return dao.modifyDestination(route);
	}
	public List<RouteDTO> viewRouteDetails() throws FRSException
	{
		// TODO Auto-generated method stub
		

		List<RouteDTO>routeList;
		routeList=(dao.getRouteList());
		return routeList;
	}
	







}