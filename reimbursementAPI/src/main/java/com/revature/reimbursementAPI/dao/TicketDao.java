package com.revature.reimbursementAPI.dao;
import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer> {
	List<Ticket> findByStatus(TicketStatus status);
	public List<Ticket> findByEmployeeId(int employeeId);
}