import { Injectable } from '@angular/core';
import {TrainingProgramModel} from '../models/trainingprogram.model'
import {HttpClient} from '@angular/common/http';
import { TrainingProgramDateModel } from '../models/trainingProgramDate.model';

@Injectable({
  providedIn: 'root'
})
export class TrainingProgramService {
trainingProgram : TrainingProgramModel[] = [];
  constructor(private http : HttpClient) { }

 //Add trainingPrograms
 addtrainingProgram(trainingProgramDate : TrainingProgramDateModel,courseId : number , facultyId : number){
  return this.http.post("http://laptop-1vm6bdau:5056/coordinator/addTrainingProgram/"+courseId+"/"+facultyId , trainingProgramDate);
}

fetchAlltrainingPrograms(){
  return this.http.get<TrainingProgramModel[]>("http://laptop-1vm6bdau:5056/coordinator/getAllTrainingProgramList");
}

deletetrainingProgram(id : number){
  return this.http.delete("http://laptop-1vm6bdau:5056/coordinator/deleteTrainingProgram/"+id);
}

getTrainingProgramByPartcipantId(id : string){
    return this.http.get<TrainingProgramModel>("http://laptop-1vm6bdau:5056/coordinator/participantenroll/gettrainingprogram/"+id);
}

}
