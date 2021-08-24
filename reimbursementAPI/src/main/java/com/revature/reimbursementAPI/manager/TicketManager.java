package com.revature.reimbursementAPI.manager;

import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;

import java.util.List;

public interface TicketManager {
    
    List<Ticket> getTickets(TicketStatus filter);

    Ticket getTicketById(Integer id);

    Ticket insert(Ticket ticket);

    Ticket updateTicket(Ticket ticket);

    void deleteTicket(Integer ticketId);
}
