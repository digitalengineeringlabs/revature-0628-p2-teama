import { Component, OnInit } from '@angular/core';
import { TicketService } from '../ticket.service';
import { Ticket } from '../tickets';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {

  tickets: Ticket[] = [];
  filteredTickets: Ticket[] = [];
  status = "pending";
  options: string[] = [
    "All",
    "Pending",
    "Approved",
    "Rejected"
  ];
  selectedOption: string = "All";

  constructor(private ticketService: TicketService) { }

  ngOnInit(): void {
    this.getTickets();
  }

getTickets() {
  this.ticketService.getAllTickets()
    .subscribe(tickets => this.tickets = tickets)
}

  updateTicket(ticket:Ticket,  status:string): void {
    ticket.status = status;
     this.ticketService.updateTicket(ticket)
       .subscribe(() => this.filterList());
   }
 
   filterList(): void {
     if (this.selectedOption == "All") {
       this.filteredTickets = this.tickets;
     } else {
       let option = this.selectedOption.toLowerCase();
       this.filteredTickets = this.tickets.filter(t => t.status == option);
     }
   }

}
