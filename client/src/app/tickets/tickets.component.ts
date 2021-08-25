import { Component, OnInit } from '@angular/core';
import { TicketService } from '../ticket.service';
import { Ticket } from '../tickets';

@Component({
  selector: 'app-tickets',
  templateUrl: './tickets.component.html',
  styleUrls: ['./tickets.component.css']
})
export class TicketsComponent implements OnInit {


  //have to figure out how to input my own values as variables
  tickets: Ticket[] = [];
  status = "pending"


  constructor(private ticketService: TicketService) { }


  ngOnInit() {
    this.getTickets();
  }

  getTickets(): void {
    this.ticketService.getTickets()
    .subscribe(tickets => 
      this.tickets = tickets)
  }

  add( ticketType: string, note: string, amount: string): void {
    //this can be changed to make sure the ticket isnt submitted
    //if there is nothing in the boxes
    //if (!status) { return; }
    
    
    this.ticketService.addTicket({ ticketType, note, amount, "status": "pending", "employeeId": 1 } as Ticket)
    
      .subscribe(ticket => {
        this.tickets.push(ticket);
      });
  }

  //need to be able to link this to the child component of
  //submit ticket to show parent child and have it as an 
  //option wherever on this page

}
