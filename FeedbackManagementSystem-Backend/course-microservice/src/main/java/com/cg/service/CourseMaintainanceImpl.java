/**
 * 
 */
package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Course;
import com.cg.dao.CourseRepository;

/**
 * @author Uma Shankar
 *
 * 04-May-2020 3:07:02 pm
 */
@Service
public class CourseMaintainanceImpl implements CourseMaintainance {
	
	@Autowired
	CourseRepository coursedao ;

	@Override
	public List<Course> getAllCourses() {
		
		return this.coursedao.findAll();	
	}

	@Override
	public Course getCourseById(Integer courseId) {
		return this.coursedao.findById(courseId).get();
		
	}

	@Override
	public Course addCourse(Course course) {
		return this.coursedao.save(course);
	
	}

	@Override
	public Boolean deleteCourse(Integer courseId) {
		this.coursedao.deleteById(courseId);
		return true ;
	}

}
