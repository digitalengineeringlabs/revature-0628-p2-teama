import { Component, OnInit } from '@angular/core';
import { TicketService } from '../ticket.service';
import { Ticket } from '../ticket';



@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {

  tickets: Ticket[] = [];


  constructor(private ticketService: TicketService) { }

  ngOnInit(): void {
    this.ticketService.getAllTickets()
    .subscribe(tickets => this.tickets = tickets)
  }

}
