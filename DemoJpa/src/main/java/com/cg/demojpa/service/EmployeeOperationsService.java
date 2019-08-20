package com.cg.demojpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.demojpa.dto.Employee;

public class EmployeeOperationsService {
	private static final String PERSISTENCE_UNIT_NAME = "radh";
    private static EntityManagerFactory factory;
	public void createEmployee() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Employee employee = new Employee();
        em.getTransaction().begin();
      
//        employee.setEmpnum(101);
//        employee.setEname("Kishori");
//        em.persist(employee);
        Employee emp = em.find(Employee.class, 101);
        if(emp!=null)
        {
        	  
        	  emp.setEname("greeshma");
        	 
        }
        
//        System.out.println(emp);       
//        em.getTransaction().commit();
//      em.close();
        Query query = em.createQuery("Select e from Employee e");
        List<Employee> list = new ArrayList();
        list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        //list.get(0);
        //list.get(1);
        for(Employee emp1 :list)
        {
        	System.out.println("Person name= " + emp1.getEname() 
            + ", number" + emp1.getEmpnum()+ "\n");
        }
  
        System.out.println("committed");
		
	} 

}
