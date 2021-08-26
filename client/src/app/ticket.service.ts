import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

import { Ticket } from './tickets';

@Injectable({providedIn : 'root'})
export class TicketService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  private getTicketUrl = 'http://localhost:8080/ticket';


  getTickets(): Observable<Ticket[]>{
    return this.http.get<Ticket[]>(this.getTicketUrl);
    
  }

  
addTicket(ticket: Ticket): Observable<Ticket> {
  return this.http.post<Ticket>(this.getTicketUrl, ticket, this.httpOptions);
}

updateTicket(ticket: Ticket): Observable<Ticket>{
  return this.http.post<Ticket>(this.getTicketUrl, ticket, this.httpOptions);

}

  constructor(private http: HttpClient) { }
}