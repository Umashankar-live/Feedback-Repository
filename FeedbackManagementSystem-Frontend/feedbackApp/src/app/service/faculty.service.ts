import { Injectable } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { HttpClient } from '@angular/common/http';
import { SkillsModel } from '../models/skills.model';

@Injectable({
  providedIn: 'root'
})
export class FacultyService {
  faculties: FacultyModel[] = [];


  constructor(private http: HttpClient) { }

  //Add Faculty
  addFaculty(faculty: FacultyModel) {
    console.log(faculty);
    return this.http.post<FacultyModel[]>("http://laptop-1vm6bdau:5053/faculty/addFaculty", faculty);
  }

  fetchAllFaculties() {
    return this.http.get<FacultyModel[]>("http://laptop-1vm6bdau:5053/faculty/getAllFaculty");
  }

  deleteFaculty(index: number) {
    return this.http.delete("http://laptop-1vm6bdau:5053/faculty/deleteFaculty/" + index);
  }
}
