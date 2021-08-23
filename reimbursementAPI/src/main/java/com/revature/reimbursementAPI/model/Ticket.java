package com.revature.reimbursementAPI.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "ticket", schema="reimbursementschema")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticket_id")
    private Integer ticket_id;

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
    private Timestamp dateMade;

    @UpdateTimestamp
    @Column(name="date_resolved", updatable = false)
    private Timestamp lastModified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employee_id")
    private Employee employee;


    public Ticket() {
        super();
    }

    public Ticket(TicketStatus status, String note, TicketType ticketType, double amount, Timestamp dateMade, Timestamp lastModified) {
        this.status = status;
        this.note = note;
        this.ticketType = ticketType;
        this.amount = amount;
        this.dateMade = dateMade;
        this.lastModified = lastModified;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getDateMade() {
        return dateMade;
    }

    public void setDateMade(Timestamp dateMade) {
        this.dateMade = dateMade;
    }

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }
}
