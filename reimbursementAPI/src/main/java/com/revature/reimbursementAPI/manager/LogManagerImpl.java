package com.revature.reimbursementAPI.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.reimbursementAPI.model.Employee;

import com.revature.reimbursementAPI.dao.LoginDao;

@Service
public class LogManagerImpl implements LoginManager {
	
	@Autowired
	private LoginDao dao;
	
	@Override
	public Employee findbyUserAndPass(String username, String password) {
		
		return dao.findByUserAndPass(username, password);
	}

	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}


}
