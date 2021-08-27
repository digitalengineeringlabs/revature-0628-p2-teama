import { Component, OnInit } from '@angular/core';


import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { TicketService } from '../ticket.service';
import { Ticket } from '../tickets';

@Component({
  selector: 'app-ticket-detail',
  templateUrl: './ticket-detail.component.html',
  styleUrls: ['./ticket-detail.component.css']
})
export class TicketDetailComponent implements OnInit {

  ticket:Ticket = {
    ticket_id: 9,
    status: '',
    note: '',
    ticketType: '',
    amount: "0",
    dateMade: undefined,
    lastModified: undefined,
    employeeId: 0
  };
  
  

  constructor(
    private route: ActivatedRoute, //holds information about the route of the detail component, this is how we get the ticketid for handleTicketDetails()
    private ticketService: TicketService, // this gets data from our server
    private location: Location // this helps us navigate to the previous page. see goBack()
  ) { 

  }

  ngOnInit(): void {
    this.handleTicketDetails();
    // this.route.paramMap.subscribe(() => {
    //   this.handleTicketDetails();
    // })
  }


  // the ticket detail needs an id parameter, so I'm wrapping it in this function 
  // that gets the id from the route
  handleTicketDetails() {
    const theTicketId: number = Number(this.route.snapshot.paramMap.get('ticket_id'));

    this.ticketService.getTicket(theTicketId)
    .subscribe(
      ticket => 
      {
        this.ticket = ticket;
      }
    )
  }

  goBack(): void { 
    this.location.back();
  }

}
