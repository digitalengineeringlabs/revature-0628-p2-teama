package com.revature.reimbursementAPI.manager;

import com.revature.reimbursementAPI.controller.TicketController;
import com.revature.reimbursementAPI.dao.TicketDao;
import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.revature.reimbursementAPI.dao.TicketDao;
import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;

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
        if (status != null) {
            return StreamSupport.stream(ticketDao.findByStatus(status).spliterator(), false).collect(Collectors.toList());
        } else {
        	return StreamSupport.stream(ticketDao.findAll().spliterator(), false).collect(Collectors.toList());
        }
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
        LOGGER.info("Calling delete from withing service implementation");
        ticketDao.deleteById(ticketId);
    }

	@Override
	public Ticket create(Ticket t) {
		return ticketDao.save(t);
	}

	@Override
	public List<Ticket> findByEmployeeId(Integer employeeId) {
		
		return ticketDao.findByEmployeeId(5);
	}

	@Override
	public List<Ticket> getTickets(TicketStatus filter) {
		// TODO Auto-generated method stub
		return null;
	}



    // create ticket

}
