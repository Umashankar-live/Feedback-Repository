import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-coordinator',
  templateUrl: './coordinator.component.html',
  styleUrls: ['./coordinator.component.css']
})
export class CoordinatorComponent implements OnInit {

  constructor(private route : Router) { }

  ngOnInit() {
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
