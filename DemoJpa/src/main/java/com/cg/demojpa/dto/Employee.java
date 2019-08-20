package com.cg.demojpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
	@Override
	public String toString() {
		return "empnum=" + empnum + ", ename=" + ename ;
	}
	@Id 
	@Column(name ="emp_id")
	private int empnum;
	private String ename;
	
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the empnum
	 */
	public int getEmpnum() {
		return empnum;
	}
	/**
	 * @param empnum the empnum to set
	 */
	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}
	
	
	

}
