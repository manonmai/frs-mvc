package com.cg.flightreservationsystem.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connect {
	private static EntityManagerFactory factory;
	public static EntityManagerFactory getEntityManagerFactory() 
	{
		if(factory==null)
		{

				factory = Persistence.createEntityManagerFactory("qwe");
	}
		return factory;
	}
	public static void shutDown()
	{
		factory.close();
	}
}
