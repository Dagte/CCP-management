import { Injectable } from '@angular/core';
import { Employee } from '../common/employee';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';



@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = 'http://localhost:8080/api/employees';

  constructor(private httpClient: HttpClient) { }

  getEmployeeList(theProjectId : number): Observable<Employee[]> {

    const searchUrl = `${this.baseUrl}/search/findByProjectId?id=${theProjectId}`;
    
    return this.httpClient.get<GetResponse>(searchUrl).pipe(
      map(response => response._embedded.employees)
    );
  }
}

interface GetResponse {
  _embedded: {
    employees: Employee[];
  }
}