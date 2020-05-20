package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Course;
import com.cg.service.CourseMaintainance;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 7:44:11 pm
 */
@RestController
@CrossOrigin("http://localhost:4200")
public class CourseController {

	@Autowired
	CourseMaintainance courseMaintainance;

	@GetMapping("/admin/getAllCourseList")
	public List<Course> getAllCourseList() {
		return this.courseMaintainance.getAllCourses();
	}

	@GetMapping("admin/getCourseById/{id}")
	public Course getCourseById(@PathVariable(value = "id") Integer courseId) {
		Course course = this.courseMaintainance.getCourseById(courseId);
		return course;
	}

	@PostMapping("/admin/addCourse")
	public Course createCourse(@Valid @RequestBody Course course) {
		return this.courseMaintainance.addCourse(course);
	}

	@DeleteMapping("/admin/deleteCourse/{id}")
	public Boolean deleteCourse(@PathVariable(value = "id") Integer courseId)
	{
		 return this.courseMaintainance.deleteCourse(courseId);
		
	}

}
