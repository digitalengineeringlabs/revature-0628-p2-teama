import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Login } from './login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };


  private loginUrl = "http://localhost:8080/login"

  constructor(private http: HttpClient) { }

    login(/*login: Login*/ login: string): Observable<Login[]> {
    return this.http.post<Login[]>(`${this.loginUrl}`, login, this.httpOptions);
  }
}
