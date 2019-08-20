package com.cg.flightreservationsystem.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.flightreservationsystem.dao.FlightRouteDao;
import com.cg.flightreservationsystem.dto.RouteDTO;
import com.cg.flightreservationsystem.exception.FRSException;
import com.cg.flightreservationsystem.utility.Queries;

/**
 * DaoImpl class for flight routes
 * 
 * @author trainee
 *
 */
@Repository
@Transactional
public class FlightRouteDaoImpl implements FlightRouteDao {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * 
	 * method to get route details
	 *
	 */

	public List<RouteDTO> getRouteList() throws FRSException {
		entityManager.close();

		String sql = Queries.GETROUTELIST;
		// Query route=entityManager.createQuery("Select route from RouteDTO route");
		TypedQuery<RouteDTO> route = (TypedQuery<RouteDTO>) entityManager.createQuery(sql);
		List<RouteDTO> routel = route.getResultList();
		return routel;

	}

	/**
	 * method to modify source
	 */

	public boolean modifySource(RouteDTO route) throws FRSException {
		
		
		int routeId;
		String source;
		routeId = route.getRouteId();
		//source = route.getSource();
		// TODO Auto-generated method stub
		boolean flag = false;
		RouteDTO route1 = entityManager.find(RouteDTO.class, routeId);
		entityManager.close();
//		if (route1 != null) {
//			route1.setSource(source);
//			flag = true;
//		}
	    entityManager.merge(route);
		flag=true;

		return flag;
	}

	/**
	 * method to modify destination
	 */

	public boolean modifyDestination(RouteDTO route) throws FRSException {
		int routeId;
		String destination;
		routeId = route.getRouteId();
		destination = route.getDestination();
		boolean flag = false;
		RouteDTO route1 = entityManager.find(RouteDTO.class, routeId);
		if (route1 != null) {
			route1.setDestination(destination);
			flag = true;
		}
		return flag;
	}
}