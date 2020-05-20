import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login.model';
import { EmployeeService } from '../service/employee.service';
import { EmployeeModel } from '../models/employee.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  emp : EmployeeModel;
  allEmployee : EmployeeModel[]=[];
  flag : EmployeeModel;
  exists : boolean=false;
  

  constructor(private empService : EmployeeService, private route : Router) {
    this.emp = new EmployeeModel();
    this.flag = new EmployeeModel();
   }

  ngOnInit() {
    this.emp.role = 'null' ;
  }

  saveEmployee(){
    console.log(this.emp);
      this.empService.registerEmployee(this.emp).subscribe(data => {
        this.flag = data;
        console.log(this.flag);
        if(this.flag==null){
          alert("Username Exists!")
        }else{
          alert("Successfully Registered!")
        }
      })
  }

  clickOnAddCourse(){
    this.route.navigate(['add-course']);
  }

  clickOnListCourse(){
    this.route.navigate(['list-course']);
  }

  clickOnAddFaculty(){
    this.route.navigate(['add-faculty']);
  }

  clickOnListFaculty(){
    this.route.navigate(['list-faculty']);
  }
  clickOnRegister(){
    this.route.navigate(['register']);
  }

  logout(){
    //localStorage.clear();
    sessionStorage.clear();
    this.route.navigate(['login']);
  }
}
