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


  ngOnInit() {
    this.getTickets();
  }

  getTickets(): void {
    this.ticketService.getTickets()
    .subscribe(tickets => {
      this.tickets = tickets;
      this.filteredTickets = tickets;
      //this.filterList();
    });
  }

  add( ticketType: string, note: string, amount: string): void {
    //this can be changed to make sure the ticket isnt submitted
    //if there is nothing in the boxes
    //if (!status) { return; }
    
    
    this.ticketService.addTicket({ ticketType, note, amount, "status": "pending", "employeeId": 1 } as Ticket)
    
      .subscribe(ticket => {
        this.tickets.push(ticket);
        this.filterList();
      });
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

  //need to be able to link this to the child component of
  //submit ticket to show parent child and have it as an 
  //option wherever on this page

}
