import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employees';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = "http://localhost:8080/employees"

  constructor(private http: HttpClient) {}

    getAllEmployees(): Observable<Employee[]>{
      return this.http.get<Employee[]>(`${this.baseUrl}`);
    }

    public deleteEmployee(employee) {
    return this.httpClient.delete<Employee>(baseUrl + "/"+ employee.empId);
  }

  public createEmployee(employee) {
    return this.httpClient.post<Employee>(baseUrl, employee);
  }


   
}
