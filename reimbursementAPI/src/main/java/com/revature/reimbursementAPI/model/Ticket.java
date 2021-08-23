package com.revature.reimbursementAPI.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

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
    @Column(name="date_made", updatable = false)
    private Timestamp dateMade;

    @UpdateTimestamp
    @Column(name="date_resolved")
    private Timestamp lastModified;

    @Column(name="employee_id")
    private Integer employeeId;


//    @ManyToOne(targetEntity = Employee.class, fetch = FetchType.LAZY)
//    @JoinColumn(name="employee_id")
//    private Employee employee;



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

    // date made shouldn't be set-able

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    //    public Employee getEmployee() {
//        return employee;
//    }

//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
}
