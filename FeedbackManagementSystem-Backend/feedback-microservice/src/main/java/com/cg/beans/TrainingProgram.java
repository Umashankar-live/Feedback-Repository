
package com.cg.beans;

import java.util.Date;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 9:07:23 pm
 */

public class TrainingProgram {


	private Integer trainingCode;

	private String courseName;

	private String facultyName ;
	
	private Integer facultyId;
	

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}


	private Date startDate;

	private Date endDate;

	public Integer getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(Integer trainingCode) {
		this.trainingCode = trainingCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
