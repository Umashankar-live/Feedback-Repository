import { Component, OnInit } from '@angular/core';
import { FeedbackModel } from '../models/feedback.model';
import { FeedbackService } from '../service/feedback.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-list-feedback-faculty',
  templateUrl: './list-feedback-faculty.component.html',
  styleUrls: ['./list-feedback-faculty.component.css']
})
export class ListFeedbackFacultyComponent implements OnInit {

  feedbackList: FeedbackModel[] = [];
  facultyId: number;

  constructor(private feedbackService: FeedbackService,
    private route: ActivatedRoute,
    private router: Router) {
    // this.feedbackL = new FeedbackModel();
  }

  ngOnInit() {
    this.route.params.subscribe(x => this.facultyId = x['id']);
    console.log(this.facultyId);
    this.feedbackService.fetchFeedbackByFacultyId(this.facultyId).subscribe(data => {
      this.feedbackList = data;
      console.log(this.feedbackList);
      if (this.feedbackList.length == 0) {
        alert("No Feedback Available for this Faculty ");
        this.router.navigate(['list-faculty']);
      }
    });

  }

  clickOnAddCourse() {
    this.router.navigate(['add-course']);
  }

  clickOnListCourse() {
    this.router.navigate(['list-course']);
  }

  clickOnAddFaculty() {
    this.router.navigate(['add-faculty']);
  }

  clickOnListFaculty() {
    this.router.navigate(['list-faculty']);
  }

  logout() {
    //localStorage.clear();
    sessionStorage.clear();
    this.router.navigate(['login']);
  }
}
