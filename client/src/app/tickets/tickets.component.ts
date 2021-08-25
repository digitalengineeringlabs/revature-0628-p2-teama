import { Component, OnInit } from '@angular/core';
import { TicketService } from '../ticket.service';
import { Ticket } from '../tickets';

@Component({
  selector: 'app-tickets',
  templateUrl: './tickets.component.html',
  styleUrls: ['./tickets.component.css']
})
export class TicketsComponent implements OnInit {

  tickets: Ticket[] = [];
  constructor(private ticketService: TicketService) { }

  ngOnInit() {
    this.getTickets();
  }

  getTickets(): void {
    this.ticketService.getTickets()
    .subscribe(tickets => 
      this.tickets = tickets)
  }

}
