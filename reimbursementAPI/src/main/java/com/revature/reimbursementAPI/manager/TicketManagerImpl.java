package com.revature.reimbursementAPI.manager;

import com.revature.reimbursementAPI.controller.TicketController;
import com.revature.reimbursementAPI.dao.TicketDao;
import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketManagerImpl implements TicketManager{

    TicketDao ticketDao;
    private static final Logger LOGGER = LogManager.getLogger(TicketManagerImpl.class);

    public TicketManagerImpl(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    // get all tickets and filtered tickets
    @Override
    public List<Ticket> getTickets(TicketStatus status) {
        LOGGER.info("Calling getTickets() from the manager implementation");
        List<Ticket> tickets = new ArrayList<>();
        if (status != null) {
        	ticketDao.findByStatus(status).forEach(tickets::add);	
        } else {
        	ticketDao.findAll().forEach(tickets::add);
        }
        return tickets;
    }

    // get ticket by id
    @Override
    public Ticket getTicketById(Integer id) {
        return ticketDao.findById(id).get();
    }

    @Override
    public Ticket insert(Ticket ticket) {
        return ticketDao.save(ticket);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
    	return ticketDao.save(ticket);
    }

    @Override
    public void deleteTicket(Integer ticketId) {

    }

    // create ticket

}
