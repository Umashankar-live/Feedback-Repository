import { Component, OnInit } from '@angular/core';
import { FeedbackModel } from '../models/feedback.model';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

import { formatDate } from '@angular/common';
import { FeedbackService } from '../service/feedback.service';

@Component({
  selector: 'app-add-feedback',
  templateUrl: './add-feedback.component.html',
  styleUrls: ['./add-feedback.component.css']
})
export class AddFeedbackComponent implements OnInit {

  feedback: FeedbackModel;
  fbPrsComm: number;

  constructor(private route: ActivatedRoute,
    private service: FeedbackService,
    private router: Router) {
    console.log(formatDate(new Date(), 'yyyy/MM/dd', 'en'));
  }

  ngOnInit() {
    this.feedback = new FeedbackModel();
  }

  onSubmit(form: NgForm) {
    console.log(this.feedback);
    this.route.params.subscribe(x => this.feedback.trainingCode = x['tId']);
    this.route.params.subscribe(x => this.feedback.facultyId = x['fId']);
    this.feedback.participantId = sessionStorage.getItem('user');
    this.feedback.feedbackDate = formatDate(new Date(), 'yyyy-MM-dd', 'en');
    this.service.addFeedback(this.feedback).subscribe(response => {
      console.log(this.feedback);
      alert("Feedback Succesfully Submitted");
      this.router.navigate(['participant']);
    });
  }

  enrolledTrainingProgram() {
    this.router.navigate(['list-participant']);
  }

}

// FeedbackModel{
//   feedbackId : number;
//   trainingCode : number ;
//   participantId : string;
//   facultyId : number;
//   fbPrsComm : number;
//   fbClrfyDbts : number;
//   fbTm : number;
//   fbHndOut : number;
//   fbHwSwNtwrk : number;
//   comments : String;
//   suggestions : String;
//   feedbackDate : string;
// } 
