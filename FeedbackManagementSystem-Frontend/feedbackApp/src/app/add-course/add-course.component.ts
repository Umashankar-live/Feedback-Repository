import { Component, OnInit } from '@angular/core';
import { CourseService } from '../service/course.service';
import { Router } from '@angular/router';
import { CourseModel } from '../models/course.model';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {
  course : CourseModel;
  constructor(private service : CourseService, private route : Router, private Auth: AuthService) {
    this.course = new CourseModel();
   }

  ngOnInit() {
  }

  redirectToAdmin(){
    this.route.navigate(['admin']);
  }

  saveCourse(){
    
    console.log(this.course.courseName);
    this.service.addCourse(this.course).subscribe(response=>{
      this.route.navigate(['list-course']);
      this.Auth.setLoggedIn(true);
    });
    
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
