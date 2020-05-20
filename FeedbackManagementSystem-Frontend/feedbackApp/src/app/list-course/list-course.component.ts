import { Component, OnInit } from '@angular/core';
import { CourseModel } from '../models/course.model';
import { CourseService } from '../service/course.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-course',
  templateUrl: './list-course.component.html',
  styleUrls: ['./list-course.component.css']
})
export class ListCourseComponent implements OnInit {

  courses: CourseModel[] =[];
  constructor(private service: CourseService,
    private route: Router) {
   }

  ngOnInit() {
    
    setTimeout(() => { this.reloadData() }, 100);
  }


  reloadData() {
    this.service.fetchAllCourses().subscribe(data => {
      this.courses =data;
      console.log(this.courses);
    });
  }




  remove(index: number){
    var ans =confirm("Are you sure you want to delete?");
    if(ans){
      this.service.deleteCourse(index).subscribe(response=>{
         console.log(this.courses);
         this.reloadData();
      });
    }
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
