package com.revature.reimbursementAPI.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.revature.reimbursementAPI.dao.LoginDao;
import com.revature.reimbursementAPI.model.Employee;

@Service
public class LoginManagerImpl implements LoginManager {

	@Autowired
	private LoginDao dao;
	
	@Override
	public Employee findbyUsernameAndPassword(String username, String password) {

		Employee e = dao.findByUsernameAndPassword(username,password);
	      if (e == null) {
	    	  System.out.println("Try Again");
	      }
	      else System.out.println("Success!");
	    System.out.println(e.getUsername());  
		return e;
	}


	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}
	

}
