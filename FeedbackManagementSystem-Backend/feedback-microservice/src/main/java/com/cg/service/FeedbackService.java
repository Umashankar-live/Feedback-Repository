/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:34:43 PM
 */
package com.cg.service;

import java.util.List;

import com.cg.beans.Feedback;

/**
 * @author Shivani
 *
 */

/**
 * Participant will give feedback 
 * 	for his particular training program
 * 
 * 
 * Add Feedback
 * Get All Feedbacks
 * Get Feedback By FacultyId
 * Get Feedback By FeedbackId
 */
public interface FeedbackService {
	
	 Feedback addFeedback(Feedback feedback);
	 List<Feedback> getAllFeedback();
	 List<Feedback> getFeedbackByFacultyId(Integer facultyId);
	 List<Feedback> getFeedbackByTrainingProgram(Integer trainingCode);
	
}
