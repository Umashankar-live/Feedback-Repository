/**
 * 
 */
package com.cg.service;

import java.util.List;

import com.cg.bean.Course;

/**
 * @author Uma Shankar
 *
 * 04-May-2020 2:47:00 pm
 * 
 * List All Courses
 * Get Course By Id
 * Add Course
 * Delete Course
 */

public interface CourseMaintainance {
	
	List<Course> getAllCourses();
	Course getCourseById(Integer courseId);
	Course addCourse(Course course);
	Boolean deleteCourse(Integer courseId);

}
