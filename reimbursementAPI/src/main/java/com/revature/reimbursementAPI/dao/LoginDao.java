package com.revature.reimbursementAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.revature.reimbursementAPI.model.Employee;

@EnableJpaRepositories
public interface LoginDao extends JpaRepository<Employee, String>{
	
	public Employee findByUsernameAndPassword(String username, String password);

	
//	public Employee findByUsername(String username);
}
