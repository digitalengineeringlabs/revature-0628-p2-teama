package com.revature.reimbursementAPI.manager;

import java.util.List;

import javax.validation.Valid;

import com.revature.reimbursementAPI.model.Employee;


public interface LoginManager{

	Employee findbyUsernameAndPassword(String username, String password);

	public Employee create(@Valid Employee employee);

}
