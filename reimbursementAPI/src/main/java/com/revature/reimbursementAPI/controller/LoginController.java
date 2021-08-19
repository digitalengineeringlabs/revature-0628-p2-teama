package com.revature.reimbursementAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.reimbursementAPI.model.Employee;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
	//List of Employees
	
	@GetMapping(produces = "application/json")
	public List<Employee> getEmployees(){
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("username","password"));
		return emp;
	}
}