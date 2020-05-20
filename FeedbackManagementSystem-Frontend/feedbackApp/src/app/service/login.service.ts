import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from '../models/login.model';
import { EmployeeModel } from '../models/employee.model';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  loginList : Login[] = [];
  

  constructor(public http : HttpClient) {
    
    // this.http.get<Login[]>("../assets/login.json")
    // .subscribe(data =>{
    //   this.loginList = data;
    // });
   }

  //  fetchLoginList():Login[]{
  //    console.log(this.loginList);
  //   return this.loginList;
  //  }

   getEmployee(login : Login){
     console.log(login);
     return this.http.post<EmployeeModel>("http://laptop-1vm6bdau:8035/login/validate",login);
   }
}
