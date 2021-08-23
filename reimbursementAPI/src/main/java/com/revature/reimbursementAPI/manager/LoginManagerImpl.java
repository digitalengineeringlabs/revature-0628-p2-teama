package com.revature.reimbursementAPI.manager;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.reimbursementAPI.dao.LoginDao;
import com.revature.reimbursementAPI.model.Employee;

@Service
public class LoginManagerImpl implements LoginManager {

	@Autowired
	private LoginDao dao;

	@Override
	public Employee findbyUsernameAndPassword(String username, String password) {

		return dao.findByUsernameAndPassword(username, password);
	}

	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

}
