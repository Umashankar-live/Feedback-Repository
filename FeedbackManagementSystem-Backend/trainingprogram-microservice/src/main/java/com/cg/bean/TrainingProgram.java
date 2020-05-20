
package com.cg.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 9:07:23 pm
 */
@Entity
@Table(name = "TRAINING_PROGRAM")
public class TrainingProgram {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRAINING_CODE")
	private Integer trainingCode;

	@Column(name = "COURSE_NAME")
	private String courseName;

	@Column(name = "FACULTY_NAME")
	private String facultyName;

	@Column(name = "FACULTY_ID")
	private Integer facultyId;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "START_DATE")
	@DateTimeFormat(style = "yyyy-mm-dd")
	private Date startDate;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "END_DATE")
	@DateTimeFormat(style = "yyyy-mm-dd")
	private Date endDate;

	public Integer getTrainingCode() {
		return trainingCode;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
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
