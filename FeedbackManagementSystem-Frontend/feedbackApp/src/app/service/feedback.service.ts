import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FeedbackModel } from '../models/feedback.model';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {


  constructor(private http: HttpClient) { 
   
  }

  

  addFeedback(feedback : FeedbackModel){
    return this.http.post("http://laptop-1vm6bdau:5054/feedback/addFeedback" , feedback);
  }

  fetchAllFeedback(){
    return this.http.get<FeedbackModel[]>("http://laptop-1vm6bdau:5054/feedback/allFeedback");
  }

  fetchFeedbackByFacultyId(index:number){
    //return this.http.get<FeedbackModel>("http://localhost:5053/feedback/forEachFaculty/{facultyId}");
    return this.http.get<FeedbackModel[]>("http://laptop-1vm6bdau:5054/feedback/forEachFaculty/"+index);
  }

  fetchFeedbackByTrainingCode(index:number){
    console.log(index);
    return this.http.get<FeedbackModel[]>("http://laptop-1vm6bdau:5054/feedback/forEachTrainingProgram/"+index);
  }
  //("http://localhost:5054/feedback/forEachTrainingProgram/"+empId+"/"+assetId+"/"+quantity);
}
