import { Component, OnInit } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { FacultyService } from '../service/faculty.service';
import { FeedbackService } from '../service/feedback.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-faculty',
  templateUrl: './list-faculty.component.html',
  styleUrls: ['./list-faculty.component.css']
})
export class ListFacultyComponent implements OnInit {

  faculty: FacultyModel[] = [];

  constructor(private facultyService: FacultyService,
    private feedbackService: FeedbackService,
    private route: Router) { }

  ngOnInit() {
     this.reloadData() 
  }

  reloadData() {
    this.facultyService.fetchAllFaculties().subscribe(data => {
      this.faculty = data;
      console.log(this.faculty);
    });
  }

  remove(index: number) {
    var ans = confirm("Are you sure you want to delete?");
    if (ans) {
      this.facultyService.deleteFaculty(index).subscribe(response => {
        this.reloadData();
      });
    }
  }

  generateReport(facultyId: number) {

    this.route.navigate(['list-feedback-faculty', facultyId]);
  }

  redirectToAdmin() {
    this.route.navigate(['admin']);
  }

  clickOnAddCourse() {
    this.route.navigate(['add-course']);
  }

  clickOnListCourse() {
    this.route.navigate(['list-course']);
  }

  clickOnAddFaculty() {
    this.route.navigate(['add-faculty']);
  }

  clickOnListFaculty() {
    this.route.navigate(['list-faculty']);
  }

  logout() {
    //localStorage.clear();
    sessionStorage.clear();
    this.route.navigate(['login']);
  }
}
