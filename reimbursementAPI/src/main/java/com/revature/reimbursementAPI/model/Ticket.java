package com.revature.reimbursementAPI.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "ticket", schema = "ReimbursementSchema")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticket_id")
    private long ticket_id;

    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    @Column(name="note")
    private String note;

    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private TicketType ticketType;

    @Column(name="amount")
    private double amount;

    @CreationTimestamp
    @Column(name="date_made")
    Timestamp dateMade;

    @UpdateTimestamp
    @Column(name="last_modified")
    Timestamp lastModified;



}
