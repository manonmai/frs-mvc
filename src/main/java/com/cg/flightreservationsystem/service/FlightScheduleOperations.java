package com.cg.flightreservationsystem.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.FRSException;
/**
 * interface for schedule of flight
 * @author trainee
 *
 */
public interface FlightScheduleOperations {
	public boolean modifyDepartureDate(ScheduleDTO scheduleDTO) throws FRSException;
	public boolean modifyArrivalDate(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyDepartureTime(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyArrivalTime(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyPrice(ScheduleDTO scheduleDTO) throws FRSException;
	public List<ScheduleDTO> viewScheduleDetails() throws FRSException;
}
