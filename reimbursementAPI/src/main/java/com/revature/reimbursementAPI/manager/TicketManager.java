package com.revature.reimbursementAPI.manager;

import java.util.List;

import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;

public interface TicketManager {
    
    List<Ticket> getTickets(TicketStatus filter);

    Ticket getTicketById(Integer id);
    
    

    Ticket insert(Ticket ticket);

    Ticket updateTicket(Ticket ticket);

    void deleteTicket(Integer ticketId);

	Ticket create(Ticket e);


	List<Ticket> findByEmployeeId(Integer employeeId);

	
}
