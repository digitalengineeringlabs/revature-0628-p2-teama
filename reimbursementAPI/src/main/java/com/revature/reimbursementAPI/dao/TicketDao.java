package com.revature.reimbursementAPI.dao;

import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer> {
	List<Ticket> findByStatus(TicketStatus status);
}
