import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from 'src/app/employee/employee.component';

@Injectable({
  providedIn: 'root'
})
export class EmployeeDataService {

  constructor(
    private httpClient:HttpClient
    ) { }

    getAllEmployee() {
      return this.httpClient.get<Employee[]>('http://localhost:8080/restex/employees')
    }
}
