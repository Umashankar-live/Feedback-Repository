import { Component, OnInit } from '@angular/core';
import { TrainingProgramService } from '../service/training-program.service';
import { HttpClient } from '@angular/common/http';
import { TrainingProgramModel } from '../models/trainingprogram.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-participant',
  templateUrl: './participant.component.html',
  styleUrls: ['./participant.component.css']
})
export class ParticipantComponent implements OnInit {

  participantId : string;
  trainingProgram : TrainingProgramModel;
  errMessage : string;
  flag : boolean=true;

  constructor(private trainingservice : TrainingProgramService,private route : Router) {
    //this.participantId = localStorage.getItem('user');
    this.participantId = sessionStorage.getItem('user');
    this.trainingProgram = new TrainingProgramModel();
    
   }

  ngOnInit() {
    this.trainingservice.getTrainingProgramByPartcipantId(this.participantId).subscribe(data=> {
      this.trainingProgram = data;
      console.log(this.trainingProgram);
      if(this.trainingProgram==null){
        alert("You are not enrolled to any Training Program. Contact Coordinator! ");
        this.route.navigate(['login']);
      }
    });

  }

  generateFeedBack(trainingId : number,facultyId:number){
    this.route.navigate(['add-feedback',trainingId,facultyId]);
  }

  logout(){
    //localStorage.clear();
    sessionStorage.clear();
    this.route.navigate(['login']);
  }

}
