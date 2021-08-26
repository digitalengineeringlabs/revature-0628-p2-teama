package com.revature.reimbursementAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.reimbursementAPI.manager.EmployeeManager;
import com.revature.reimbursementAPI.model.Employee;


@RestController
@RequestMapping(path="/employees")
public class EmpController {

	@Autowired
	private EmployeeManager manager;

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(produces="application/json")
	public List<Employee> getAllEmployees(){
		return manager.findAll();
	}

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="/{id}", produces="application/json")
	public Employee getEmployee(@PathVariable int id){
		return manager.findById(id);
	}

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping( consumes="application/json", produces="application/json")
	public Employee create(@RequestBody Employee employee){
		return manager.create(employee);
	}

}