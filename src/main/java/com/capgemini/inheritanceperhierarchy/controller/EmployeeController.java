package com.capgemini.inheritanceperhierarchy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritanceperhierarchy.enity.ContractEmployee;
import com.capgemini.inheritanceperhierarchy.enity.Employee;
import com.capgemini.inheritanceperhierarchy.enity.RegularEmployee;
import com.capgemini.inheritanceperhierarchy.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/")
	public Employee addEmployee() {
		
		Employee emp = new Employee(103, "akshata");
		service.add(emp);

		RegularEmployee regular = new RegularEmployee(101, "aks", 25000, 2000);
		service.add(regular);

		ContractEmployee contract = new ContractEmployee(102, "mahi", 20000, "48 hours");
		service.add(contract);

		return emp;
	}

	@RequestMapping("/get")
	public Employee getEmployee() {
		return service.getDetails(1);
	}

}
