package com.revature.reimbursementAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.reimbursementAPI.model.Employee;



public interface EmployeeDao extends JpaRepository<Employee, Integer> {

//	public List<Employee> findByGenderAndAge(String gender, int age);
//
//	@Query(value="select e from Employee e where e.salary between :start and :end")
//	public List<Employee> getEmployeesWithMedian(@Param("start") int start, @Param("end") int end);
//
//	@Query(value="select * from employee where age > ?1",nativeQuery = true)
//	public List<Employee> getSeniorEmployees(int limit);


}
