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

import java.text.MessageFormat;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketManager ticketManager;

    private static final Logger LOGGER = LogManager.getLogger(TicketController.class);

//    public TicketController(TicketManager ticketManager) {
//        this.ticketManager = ticketManager;
//    }

    @GetMapping
    public ResponseEntity<List<Ticket>> getAllTickets() {
        LOGGER.info("Fetching all Tickets");
        List<Ticket> tickets = ticketManager.getTickets();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    @GetMapping({"/{ticketId}"})
    public ResponseEntity<Ticket> getTicket(@PathVariable Integer ticketId) {
        return new ResponseEntity<>(ticketManager.getTicketById(ticketId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {
        Ticket ticket1 = ticketManager.insert(ticket);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("ticket", "/ticket" + ticket1.getTicket_id().toString());
        return new ResponseEntity<>(ticket1, httpHeaders, HttpStatus.CREATED);

    }

    @DeleteMapping({"/delete/{ticketId}"})
    public ResponseEntity<Ticket> deleteTicket(@PathVariable("ticketId") Integer ticketId) {
        LOGGER.info(MessageFormat.format("Calling delete method on ticket id: {0}", ticketId));
        ticketManager.deleteTicket(ticketId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
