import { Component, OnInit } from '@angular/core';
import { TicketService } from '../ticket.service';
import { Ticket } from '../tickets';

import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-submit-ticket',
  templateUrl: './submit-ticket.component.html',
  styleUrls: ['./submit-ticket.component.css']
})
export class SubmitTicketComponent implements OnInit {

  tickets: Ticket[] = [];
  showMsg: boolean = false;


  constructor(private ticketService: TicketService) { }

  ngOnInit(): void {
    //this.showMsg = false;
  }

//need to figure out how this will run 

  add( ticketType: string, note: string, amount: string): void {
    

    this.ticketService.addTicket({ ticketType, note, amount, "status": "pending", "employeeId": 1 } as Ticket)
    
      .subscribe(ticket => {
        this.tickets.push(ticket);
        //this.showMsg = true;
      });
  }


}
