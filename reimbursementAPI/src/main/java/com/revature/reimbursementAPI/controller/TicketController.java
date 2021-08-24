package com.revature.reimbursementAPI.controller;

import com.revature.reimbursementAPI.manager.TicketManager;
import com.revature.reimbursementAPI.manager.TicketManagerImpl;
import com.revature.reimbursementAPI.model.Ticket;
import com.revature.reimbursementAPI.model.TicketStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    TicketManager ticketManager;
    private static final Logger LOGGER = LogManager.getLogger(TicketController.class);

    public TicketController(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets(@RequestParam(required = false) TicketStatus status) {
        LOGGER.info("Fetching all Tickets");
        List<Ticket> tickets = ticketManager.getTickets(status);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping({"/{ticketId}"})
    public ResponseEntity<Ticket> getTicket(@PathVariable Integer ticketId) {
        return new ResponseEntity<>(ticketManager.getTicketById(ticketId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {
    	if (ticket.getTicket_id() != null) {
    		return ResponseEntity.ok().body(ticketManager.updateTicket(ticket));
    	} else {
    		Ticket ticket1 = ticketManager.insert(ticket);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("ticket", "/ticket" + ticket1.getTicket_id().toString());
            return new ResponseEntity<>(ticket1, httpHeaders, HttpStatus.CREATED);
    	}
    }
}
