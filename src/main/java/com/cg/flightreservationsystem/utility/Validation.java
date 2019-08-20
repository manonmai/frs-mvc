package com.cg.flightreservationsystem.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.cg.flightreservationsystem.exception.FRSException;

/**
 * Validation class to validate the data entered by user
 * @author seeta
 *
 */
public class Validation {
	/**
	 * Checks if flight id format
	 * @param flightId
	 * @return boolean
	 * @throws IdInvalidException
	 * @throws NullValueException
	 * @throws FRSException 
	 */
	public boolean isAeroplaneIdValid(String flightId) throws FRSException
	{
		Pattern pattern = Pattern.compile("[p][l][-][0-9]{3}");
		Matcher match = pattern.matcher(flightId);
		if(!match.matches())
		{
			throw new FRSException(ExceptionMessages.MESSAGE3);
		}
		return true;
	}
	/**
	 * checks if schedule id is valid or not
	 * @param scheduleId
	 * @return boolean
	 * @throws IdInvalidException
	 * @throws NullValueException
	 * @throws FRSException 
	 */
	public boolean isFlightIdValid(String scheduleId) throws FRSException
	{
		Pattern pattern = Pattern.compile("[f][a][-][0-9]{3}");
		Matcher match = pattern.matcher(scheduleId);
		if(!match.matches())
		{
			throw new FRSException( ExceptionMessages.MESSAGE3);
		}
		
		return true;
	}
	/**
	 * checks if place is valid or not
	 * @param place
	 * @return boolean
	 * @throws PlaceInvalidException
	 * @throws NullValueException
	 */
	public boolean isPlaceValid(String place) throws FRSException
	{
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]*");
		Matcher match = pattern.matcher(place);
		if(!match.matches())
		{
			throw new FRSException( ExceptionMessages.MESSAGE5);
		}
		return true; 
	}
	/**
	 * checks date format
	 * @param date
	 * @return boolean
	 * @throws DateInvalidException
	 * @throws NullValueException
	 */
	public boolean isDateValid(String date) throws FRSException
	{
		if( date.matches("\\d{4}-\\d[0-9]{2}-\\d[0-3]{2}"))
		{
			return true;
		
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-dd-MM");
		format.setLenient(false);
		try {
			format.parse(date);
			return true;
		}
		catch(ParseException e) {
			throw new FRSException( ExceptionMessages.MESSAGE6);
		}
	}
	/**
	 * checks time format
	 * @param time
	 * @return boolean
	 * @throws TimeInvalidException
	 * @throws NullValueException
	 */
	public boolean isTimevalid(String time) throws FRSException
	{
		Pattern pattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");
		Matcher match = pattern.matcher(time);
		if(!match.matches())
		{
			throw new FRSException( ExceptionMessages.MESSAGE7);
		}
		return true; 
	}
	/**
	 * checks capacity count
	 * @param capacity
	 * @return boolean
	 * @throws CapacityInvalidException
	 * @throws NullValueException
	 */
	public boolean isCapacityValid(String capacity) throws FRSException
	{
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[1-9][0-9][0-9]");
		Matcher match = pattern.matcher(capacity);
		if(!match.matches())
		{
			throw new FRSException( ExceptionMessages.MESSAGE8);
		}
		return true; 
	}
	/**
	 * checks price format
	 * @param price
	 * @return boolean
	 * @throws PriceInvalidException
	 * @throws NullValueException
	 * @throws FRSException 
	 */
	public boolean isPricevalid(String price) throws FRSException
	{
		Pattern pattern = Pattern.compile("[1-9][0-9]{1,12}");
		Matcher match = pattern.matcher(price);
	//	(\\.[0-9]+)?
		if(!match.matches())
		{
			throw new FRSException( ExceptionMessages.MESSAGE9);
		}
		return true; 
	}
	
	

}
