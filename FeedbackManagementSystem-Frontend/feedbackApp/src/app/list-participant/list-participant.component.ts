import { Component, OnInit } from '@angular/core';
import { ParticipantEnrolledModel } from '../models/participantEnrolled.model'
import { EnrollService } from '../service/enroll.service';
import { TrainingProgramModel } from '../models/trainingprogram.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-participant',
  templateUrl: './list-participant.component.html',
  styleUrls: ['./list-participant.component.css']
})
export class ListParticipantComponent implements OnInit {
  enrolledList: ParticipantEnrolledModel[] = [];
  //trainingP:TrainingProgramModel;

  constructor(private enrolledService: EnrollService,
    private route: Router) {
    //this.trainingP =new TrainingProgramModel();
  }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);

    //console.log(this.enrolledList[0].trainingProgram.trainingCode);
  }

  reloadData() {
    this.enrolledService.fetchAllParticipantEnrolled().subscribe(data => {
    this.enrolledList = data;
      console.log(this.enrolledList);
    });

  }

  removeParticipant(index: number) {
    var ans = confirm("Are you sure you want to delete?");
    if (ans) {
      this.enrolledService.deleteEnrollParticipant(index).subscribe(response => {
        this.reloadData();
      });
    }
  }
  clickOnAddTrainingProgram() {
    this.route.navigate(['add-training']);
  }

  clickOfListTrainingProgram() {
    this.route.navigate(['list-training']);
  }

  clickOnAddParticipantEnrolled() {
    this.route.navigate(['enroll-participant']);
  }
  clickOfListParticipantEnrolled() {
    this.route.navigate(['list-participant']);
  }
  logout() {
    //localStorage.clear();
    sessionStorage.clear();
    this.route.navigate(['login']);
  }

}
