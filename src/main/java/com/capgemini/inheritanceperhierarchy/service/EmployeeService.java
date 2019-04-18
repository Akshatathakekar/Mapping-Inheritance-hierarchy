package com.capgemini.inheritanceperhierarchy.service;

import com.capgemini.inheritanceperhierarchy.enity.Employee;

public interface EmployeeService {

	public Employee add(Employee employee);
	public Employee getDetails(int id);
	
}
