package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.bean.ParticipantEnrolled;
import com.cg.bean.TrainingProgram;

/**
 * @author Win10
 *
 * Enroll a Participant
 * Show the list of Participant Enrolled
 * Delete all the Enrolled when Training Program Get Deleted 
 * Delete Participant Enrolled By Id
 *
 */
public interface ParticipantEnrollMaintainance {

	// Participant Enrollment
	ParticipantEnrolled enrollParticipant(Employee employee, TrainingProgram tp);

	List<ParticipantEnrolled> getAllParticipantEnrolled();

	void deleteAllEnrolledParticipant(Integer trainingCode);

	void deleteParticipantEnrolled(Integer empId);

}
