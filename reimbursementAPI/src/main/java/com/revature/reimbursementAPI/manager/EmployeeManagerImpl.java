package com.revature.reimbursementAPI.manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.reimbursementAPI.model.Employee;

import com.revature.reimbursementAPI.dao.EmployeeDao;





@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	private EmployeeDao dao;

	@Override
	public List<Employee> findAll() {

//		return dao.findByGenderAndAge("M",31);
//		return dao.getEmployeesWithMedian(40000,50000);
//		return dao.getSeniorEmployees(30);

		return StreamSupport.stream(dao.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}


	@Override
	public Employee findById(int id) {
		return dao.findById(Integer.valueOf(id)).get();
	}

//	@Override
//	public List<GenderSalary> fetchSalaryDataByGender() {
//
//		return dao.fetchSalaryDataByGender();
//	}

	@Override
	public Employee create(Employee e) {
		return dao.save(e);
	}

}
