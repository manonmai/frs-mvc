package com.cg.flightreservationsystem.dao;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.FRSException;
/**
 * Interface for schedule dao
 * @author seeta
 *
 */
public interface FlightScheduleDao {
	public List<ScheduleDTO> getList() throws FRSException;

	public boolean modifyDepartureDate(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyArrivalDate(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyDepartureTime(ScheduleDTO scheduleDTO)  throws FRSException;

	public boolean modifyArrivalTime(ScheduleDTO scheduleDTO)  throws FRSException;

	public boolean modifyPrice(ScheduleDTO scheduleDTO)  throws FRSException;

}
