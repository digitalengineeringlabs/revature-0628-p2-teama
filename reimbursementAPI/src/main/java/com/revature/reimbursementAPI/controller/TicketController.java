package com.revature.reimbursementAPI.controller;


import com.revature.reimbursementAPI.manager.TicketManager;
import com.revature.reimbursementAPI.manager.TicketManagerImpl;
import com.revature.reimbursementAPI.model.Ticket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
    private TicketManager ticketManager;
    
    private static final Logger LOGGER = LogManager.getLogger(TicketController.class);

 
    @GetMapping
    public List<Ticket> getAllTickets() {
       LOGGER.info("Fetching all Tickets");
       return ticketManager.getTickets();
    }

    @GetMapping(path="/{ticketId}", produces="application/json")
    public Ticket getTicket(@PathVariable Integer ticketId) {
        return ticketManager.getTicketById(ticketId);
    }
    
    @GetMapping(path="/e/{employeeId}", produces="application/json")
    public List<Ticket> getTicketsByEmployee(@PathVariable Integer employeeId) {
        return ticketManager.findByEmployeeId(employeeId);
    }
    

    
    @PostMapping(consumes="application/json", produces="application/json")
	public Ticket create(@RequestBody Ticket t) {
		return ticketManager.create(t);
	}

}
