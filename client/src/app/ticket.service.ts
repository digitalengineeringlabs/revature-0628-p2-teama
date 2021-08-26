import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Ticket } from './ticket';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Ticket } from './tickets';

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private baseUrl = "http://localhost:8080/ticket"

  constructor(private http: HttpClient) { }

  getAllTickets(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(`${this.baseUrl}`);
  }

  getTicket(ticket_id: number): Observable<Ticket> {
    const detailUrl = `${this.baseUrl}/${ticket_id}`;
    return this.http.get<Ticket>(detailUrl);
  }
  
  addTicket(ticket: Ticket): Observable<Ticket> {
    return this.http.post<Ticket>(this.baseUrl, ticket, this.httpOptions);
  }

  updateTicket(ticket: Ticket): Observable<Ticket>{
    return this.http.post<Ticket>(this.baseUrl, ticket, this.httpOptions);

  }
}
