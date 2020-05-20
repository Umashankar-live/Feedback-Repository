
package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Uma Shankar
 *
 * 04-May-2020 2:35:08 pm
 */
@Entity
@Table(name = "COURSE_MASTER")
public class Course {
	
	@Id
	@Column(name = "COURSE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "NO_OF_DAYS")
	private Integer noOfDays;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Course(Integer courseId, String courseName, Integer noOfDays) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.noOfDays = noOfDays;
	}

	
	public Course() {}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", noOfDays=" + noOfDays + "]";
	}

	
	

	

}
