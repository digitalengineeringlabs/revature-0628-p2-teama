package com.revature.reimbursementAPI.dao;

import com.revature.reimbursementAPI.model.Ticket;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer> {

	public List<Ticket> findByEmployeeId(int employeeId);
}
