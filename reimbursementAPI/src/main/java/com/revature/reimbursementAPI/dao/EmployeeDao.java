package com.revature.reimbursementAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.reimbursementAPI.model.Employee;



public interface EmployeeDao extends JpaRepository<Employee, Integer> {


}