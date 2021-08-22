package com.revature.reimbursementAPI.manager;

import java.util.List;

import com.revature.reimbursementAPI.model.Employee;



public interface EmployeeManager {

	List<Employee> findAll();
	
//	List<Employee> findAll(int startIndex, int count);

	Employee findById(int id);
	
	Employee create(Employee e);

}
