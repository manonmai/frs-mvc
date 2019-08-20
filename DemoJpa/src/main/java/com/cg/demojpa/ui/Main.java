package com.cg.demojpa.ui;

import com.cg.demojpa.service.EmployeeOperationsService;

public class Main {
	
    public static void main(String[] args) {
    	EmployeeOperationsService emp = new EmployeeOperationsService();
    	emp.createEmployee();
	}

}
