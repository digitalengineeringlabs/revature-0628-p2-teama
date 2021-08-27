package com.revature.reimbursementAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.reimbursementAPI.manager.EmployeeManager;
import com.revature.reimbursementAPI.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/employee")
public class EmpController {

	@Autowired
	private EmployeeManager manager;
	

	@GetMapping(produces="application/json")
	public List<Employee> getAllEmployees(){
			return manager.findAll();

	}
	
	

	@DeleteMapping(path = { "/{id}"})
	public Employee delete(@PathVariable("id") int id) {
			Employee deletedEmp = null;
			for (Employee emp : manager.findAll()) {
				if (emp.getEmployee_id().equals(id)) {
					manager.findAll().remove(emp);
					deletedEmp = emp;
					break;
				}
			}
			return deletedEmp;
	}

//	@GetMapping(path="/{id}", produces="application/json")
//	public Employee getEmployee(@PathVariable int id){
//		return manager.findById(id);
//	}
//
	@PostMapping(consumes="application/json", produces="application/json")
	public Employee create(@RequestBody Employee emp){
		manager.findAll().add(emp);
		System.out.println(manager.findAll());
		return emp;
	}

}