package com.revature.reimbursementAPI.manager;


import javax.validation.Valid;

import com.revature.reimbursementAPI.model.Employee;


public interface LoginManager{

	Employee findByUsernameAndPassword(String username, String password);

//	public Employee findByUsername(String username);
	
	public Employee create(@Valid Employee employee);

}