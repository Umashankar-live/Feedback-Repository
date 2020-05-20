import { Component, OnInit } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { FacultyService } from '../service/faculty.service';
import { Router } from '@angular/router';

import { NgForm } from '@angular/forms';
import { s } from '@angular/core/src/render3';

@Component({
  selector: 'app-add-faculty',
  templateUrl: './add-faculty.component.html',
  styleUrls: ['./add-faculty.component.css']
})
export class AddFacultyComponent implements OnInit {
  faculty : FacultyModel;
  selectedSkills:String[]=[];
  index : number=0;
  checkedSkills:String[]=[];

  constructor(
    private service : FacultyService,
    private route : Router  ) {

    this.faculty = new FacultyModel();
  
   }

  ngOnInit() {
    this.selectedSkills=["Java","C++","DevOps","RDBMS","GitHub","Spring 5","Microservice","AWS","Angular 6"];

  }

 
  add(index:number){
    
    this.checkedSkills.push(this.selectedSkills[index]);
    this.selectedSkills.splice(index, 1); 
    
  }

  saveFaculty(){
    console.log(this.checkedSkills);
    this.faculty.skills=this.checkedSkills;
    console.log(this.faculty);
    this.service.addFaculty(this.faculty).subscribe(response=>{
      this.route.navigate(['list-faculty'])
    });
  }

  redirectToAdmin(){
    this.route.navigate(['admin']);
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
