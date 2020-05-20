
package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 9:08:23 pm
 */
@Entity
@Table(name = "PARTICIPANT_ENROLLED")
public class ParticipantEnrolled{

	@Id
	@Column(name = "PARTICIPANT_ID")
	private Integer participantId;

	@Column(name = "PARTICIPANT_NAME")
	private String participantName;

	@Column(name = "TRAINING_CODE")
	private Integer trainingCode;

	@Column(name = "COURSE_NAME")
	private String courseName;

	@Column(name = "FACULTY_NAME")
	private String facultyName;

	public Integer getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

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

}
