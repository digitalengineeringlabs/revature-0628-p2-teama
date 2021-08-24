package com.revature.reimbursementAPI.manager;

import java.util.List;

import com.revature.reimbursementAPI.model.Employee;



public interface EmployeeManager {

	List<Employee> findAll();

	Employee findById(int id);

	Employee create(Employee e);

}