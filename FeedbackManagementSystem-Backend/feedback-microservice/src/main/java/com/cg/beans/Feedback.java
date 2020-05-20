/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:40:18 AM
 */
package com.cg.beans;


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
 * @author Shivani
 *
 */
@Entity
@Table(name = "FEEDBACK_MASTER")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feedbackId;
	
	@Column(name ="TRAINING_CODE")
	private Integer trainingCode;
	
	
	@Column(name ="EMPLOYEE_ID")
	private Integer participantId;
	
	@Column(name ="FACULTY_ID")
	private Integer facultyId ;

	/**
	 * Feedback for Presentation and Communication Skills
	 */
	@Column(name = "FB_Prs_comm")
	private Integer fbPrsComm;
	
	/**
	 * Feedback for Ability to Clarify Doubts
	 */
	@Column(name = "FB_Clrfy_dbts")
	private Integer fbClrfyDbts;
	
	/**
	 * Feedback for Time Management Skills
	 */
	@Column(name = "FB_TM")
	private Integer fbTm;
	
	/**
	 * Feedback for Providing Handouts and other material
	 */
	@Column(name = "FB_Hnd_out")
	private Integer fbHndOut;
	
	/**
	 * Feedback for Hardware, Software and Network Ability
	 */
	@Column(name = "FB_Hw_Sw_Ntwrk")
	private Integer fbHwSwNtwrk;
	
	/**
	 * Comments
	 */
	@Column(name = "Comments")
	private String comments;
	
	/**
	 * Suggestions
	 */
	@Column(name = "Suggestions")
	private String suggestions;
	
	/**
	 * Time of Feedback
	 */
	@Column(name = "fbdate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date feedbackDate;
	
	/******
	 * Default Constructor
	 *****/
	public Feedback() {

	}
	
	/*************************
	 * Getters and Setters
	 ***************************/

	/**
	 * @return the feedbackId
	 */    
	public Integer getFeedbackId() {
		return feedbackId;
	}

	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	/**
	 * @return the trainingCode
	 */
	public Integer getTrainingCode() {
		return trainingCode;
	}

	/**
	 * @param trainingCode the trainingCode to set
	 */
	public void setTrainingCode(Integer trainingCode) {
		this.trainingCode = trainingCode;
	}

	/**
	 * @return the participantId
	 */
	public Integer getParticipantId() {
		return participantId;
	}

	/**
	 * @param participantId the participantId to set
	 */
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}

	/**
	 * @return the fbPrsComm
	 */
	public Integer getFbPrsComm() {
		return fbPrsComm;
	}

	/**
	 * @param fbPrsComm the fbPrsComm to set
	 */
	public void setFbPrsComm(Integer fbPrsComm) {
		this.fbPrsComm = fbPrsComm;
	}

	/**
	 * @return the fbClrfyDbts
	 */
	public Integer getFbClrfyDbts() {
		return fbClrfyDbts;
	}

	/**
	 * @param fbClrfyDbts the fbClrfyDbts to set
	 */
	public void setFbClrfyDbts(Integer fbClrfyDbts) {
		this.fbClrfyDbts = fbClrfyDbts;
	}

	/**
	 * @return the fbTm
	 */
	public Integer getFbTm() {
		return fbTm;
	}

	/**
	 * @param fbTm the fbTm to set
	 */
	public void setFbTm(Integer fbTm) {
		this.fbTm = fbTm;
	}

	/**
	 * @return the fbHndOut
	 */
	public Integer getFbHndOut() {
		return fbHndOut;
	}

	/**
	 * @param fbHndOut the fbHndOut to set
	 */
	public void setFbHndOut(Integer fbHndOut) {
		this.fbHndOut = fbHndOut;
	}

	/**
	 * @return the fbHwSwNtwrk
	 */
	public Integer getFbHwSwNtwrk() {
		return fbHwSwNtwrk;
	}

	/**
	 * @param fbHwSwNtwrk the fbHwSwNtwrk to set
	 */
	public void setFbHwSwNtwrk(Integer fbHwSwNtwrk) {
		this.fbHwSwNtwrk = fbHwSwNtwrk;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the suggestions
	 */
	public String getSuggestions() {
		return suggestions;
	}

	/**
	 * @param suggestions the suggestions to set
	 */
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	/**
	 * @return the feedbackDate
	 */
	public Date getFeedbackDate() {
		return feedbackDate;
	}

	/**
	 * @param feedbackDate the feedbackDate to set
	 */
	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	/**
	 * @return the facultyId
	 */
	public Integer getFacultyId() {
		return facultyId;
	}

	/**
	 * @param facultyId the facultyId to set
	 */
	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	
	
	
	
}
