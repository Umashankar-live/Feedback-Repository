import { Injectable } from '@angular/core';
import {EmployeeModel} from '../models/employee.model';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
Employee : EmployeeModel[]=[];
  constructor(private http : HttpClient) { }

  fetchAllParticipants(){
    return this.http.get<EmployeeModel[]>("http://laptop-1vm6bdau:8034/employee/getAllParticipantList");
    console.log(this.http.get<EmployeeModel[]>("http://laptop-1vm6bdau:8034/employee/getAllParticipantList"));
  }

  fetchAllEmployee(){
    return this.http.get<EmployeeModel[]>("http://laptop-1vm6bdau:8034/employee/getAllEmployees");
  }

  registerEmployee(emp : EmployeeModel){
    return this.http.post<EmployeeModel>("http://laptop-1vm6bdau:8034/employee/addemployee", emp);
  }
}
