import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ticket } from './ticket';

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
}
