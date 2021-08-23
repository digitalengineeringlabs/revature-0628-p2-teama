package com.revature.reimbursementAPI.manager;

import com.revature.reimbursementAPI.model.Ticket;

import java.util.List;

public interface TicketManager {

    List<Ticket> getTickets();

    Ticket getTicketById(Integer id);

    Ticket insert(Ticket ticket);

    void updateTicket(Integer id, Ticket ticket);

    void deleteTicket(Integer ticketId);
}
