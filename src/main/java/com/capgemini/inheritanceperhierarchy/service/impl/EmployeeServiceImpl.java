package com.capgemini.inheritanceperhierarchy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritanceperhierarchy.dao.EmployeeDao;
import com.capgemini.inheritanceperhierarchy.enity.Employee;
import com.capgemini.inheritanceperhierarchy.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee add(Employee employee) {
		
		dao.save(employee);
		
		return employee;
	}

	@Override
	public Employee getDetails(int id) {
		
		return dao.findById(id).get();
	}

}
