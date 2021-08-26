import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = "http://localhost:8080/employees"

  constructor(private http: HttpClient) {}

    getAllEmployees(): Observable<Employee[]>{
      return this.http.get<Employee[]>(`${this.baseUrl}`);
    }
   
}
