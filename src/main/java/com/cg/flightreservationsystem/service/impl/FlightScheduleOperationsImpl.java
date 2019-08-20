package com.cg.flightreservationsystem.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightreservationsystem.dao.FlightScheduleDao;
import com.cg.flightreservationsystem.dao.impl.FlightScheduleDaoImpl;
import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.service.FlightScheduleOperations;
import com.cg.flightreservationsystem.utility.Validation;

@Service
public class FlightScheduleOperationsImpl implements FlightScheduleOperations{
	@Autowired
	 FlightScheduleDao daoImpl ;
	
	 public void setDaoImpl(FlightScheduleDao daoImpl) {
		this.daoImpl = daoImpl;
	}

	ScheduleDTO dto = new ScheduleDTO();
	 /**
		 * service method to modify departure date
		 */
	public boolean modifyDepartureDate(ScheduleDTO scheduleDTO) throws FRSException
	{
		
		boolean flag;
		flag=false;
		if(daoImpl.modifyDepartureDate( scheduleDTO)) {
			flag=true;
			}
		return flag;
	}
	
	/**
	 * service method to arrival date
	 */
	public boolean modifyArrivalDate(ScheduleDTO scheduleDTO)throws FRSException
	{
			
		return daoImpl.modifyArrivalDate(scheduleDTO);
		
	}
	/**
	 * service method to modify departure time
	 */
	public boolean modifyDepartureTime(ScheduleDTO scheduleDTO)  throws FRSException
	{
		boolean flag;
		flag=false;
		if(daoImpl.modifyDepartureTime(scheduleDTO)) {
			flag=true;
			}
		return flag;
	}
	/**
	 * service method to modify arrival time
	 */
	public boolean modifyArrivalTime(ScheduleDTO scheduleDTO) throws FRSException
	{
		
		return daoImpl.modifyArrivalTime(scheduleDTO);
	}
	/**
	 * service method to modify price
	 */
	public boolean modifyPrice(ScheduleDTO scheduleDTO) throws FRSException
	{
		boolean flag;
		flag=false;
		if(daoImpl.modifyPrice(scheduleDTO)) {
			flag=true;
			}
		return flag;
	}
	
	public List<ScheduleDTO> viewScheduleDetails() throws  FRSException
	{
		// TODO Auto-generated method stub
		return daoImpl.getList();
	}
	
	

		
	}
