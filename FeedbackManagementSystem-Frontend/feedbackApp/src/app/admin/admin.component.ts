import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private route : Router) { }

  ngOnInit() {
   // alert("Hello "+localStorage.getItem('user'));
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
