import { Injectable } from '@angular/core';
import { CourseModel } from '../models/course.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  //courses : CourseModel[] = [];

  constructor(private http: HttpClient) { }

  //Add Courses
  addCourse(course : CourseModel){
    return this.http.post("http://laptop-1vm6bdau:5057/admin/addCourse" , course);
  }

  fetchAllCourses(){
    return this.http.get<CourseModel[]>("http://laptop-1vm6bdau:5057/admin/getAllCourseList");
  }

  deleteCourse(index : number){
    console.log(index);
    return this.http.delete("http://laptop-1vm6bdau:5057/admin/deleteCourse/"+index);
  }
}
