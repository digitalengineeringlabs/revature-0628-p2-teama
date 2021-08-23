package com.revature.reimbursementAPI.manager;


import javax.validation.Valid;

import com.revature.reimbursementAPI.model.Employee;


public interface LoginManager{
<<<<<<< HEAD

	Employee findbyUsernameAndPassword(String username, String password);

//	public Employee findByUsername(String username);
	
	public Employee create(@Valid Employee employee);
=======

	public Employee findbyUserAndPass(String username, String password);

	public Employee create(@Valid Employee emp);
>>>>>>> 37eeada69c647fa13921fd25411a7b0052a548a4

}
