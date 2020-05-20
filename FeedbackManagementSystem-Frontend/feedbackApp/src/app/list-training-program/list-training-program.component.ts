import { Component, OnInit } from '@angular/core';
import { TrainingProgramModel } from '../models/trainingprogram.model';
import { TrainingProgramService } from '../service/training-program.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-training-program',
  templateUrl: './list-training-program.component.html',
  styleUrls: ['./list-training-program.component.css']
})
export class ListTrainingProgramComponent implements OnInit {
  trainingList: TrainingProgramModel[] = [];
  constructor(private service: TrainingProgramService,
    private route: Router) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);
  }
  reloadData() {
    this.service.fetchAlltrainingPrograms().subscribe(data => {
      this.trainingList = data;
      console.log(this.trainingList);
    })
  }



  deleteTraining(index: number) {
    var ans = confirm("Are you sure you want to delete?");
    if (ans) {
      this.service.deletetrainingProgram(index).subscribe(response => {
        this.reloadData();
      });
    }
  }

  showFeedback(tId: number) {
    this.route.navigate(['list-feedback-training-program', tId]);
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
