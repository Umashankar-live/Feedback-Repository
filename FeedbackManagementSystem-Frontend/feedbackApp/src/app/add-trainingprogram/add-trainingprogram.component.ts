import { Component, OnInit } from '@angular/core';
import { TrainingProgramService } from '../service/training-program.service';
import { Router } from '@angular/router';
import { TrainingProgramDateModel } from '../models/trainingProgramDate.model';
import { CourseModel } from '../models/course.model';
import { CourseService } from '../service/course.service';
import { FacultyService } from '../service/faculty.service';
import { FacultyModel } from '../models/faculty.model';




@Component({
  selector: 'app-add-trainingprogram',
  templateUrl: './add-trainingprogram.component.html',
  styleUrls: ['./add-trainingprogram.component.css']
})
export class AddTrainingprogramComponent implements OnInit {
  trainingProgramDate : TrainingProgramDateModel ;
  courses: CourseModel[] = [];
  faculty: FacultyModel[] = [];
  courseId: number;
  facultyId: number;
  selectedCourse: String="";
  selectedFaculty: String="";



  constructor(private service: TrainingProgramService,
    private route: Router, private courseService: CourseService, private facultyService: FacultyService) {
    this.trainingProgramDate = new TrainingProgramDateModel();
  }

  ngOnInit() {
    this.courseService.fetchAllCourses().subscribe(data => {
      this.courses = data;
      console.log(this.courses);
    });

    this.facultyService.fetchAllFaculties().subscribe(data => {
      this.faculty = data;
      console.log(this.faculty);
    });

  }

  addCourse(cnumber: number,cName:String) {
    this.courseId = cnumber;
    console.log(cnumber);
    this.selectedCourse=cName;

  }

  addFaculty(fnumber: number,fName:String) {
    this.facultyId = fnumber;
    console.log(fnumber);
    this.selectedFaculty=fName;

  }

  savetrainingProgram() {
    this.service.addtrainingProgram(this.trainingProgramDate , this.courseId ,this.facultyId).subscribe(response => {
      this.route.navigate(['list-training']);
    });

  }
  

  clickOnAddTrainingProgram(){
    this.route.navigate(['add-training']);
  }

  clickOfListTrainingProgram(){
    this.route.navigate(['list-training']);
  }

  clickOnAddParticipantEnrolled(){
    this.route.navigate(['enroll-participant']);
  }
  clickOfListParticipantEnrolled(){
    this.route.navigate(['list-participant']);
  }
  logout(){
    //localStorage.clear();
    sessionStorage.clear();
    this.route.navigate(['login']);
  }


}
