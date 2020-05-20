/**
 * 
 */
package com.cg.service;

import java.util.List;

import com.cg.bean.TrainingProgram;

/**
 * @author Uma Shankar
 *
 * 04-May-2020 2:47:00 pm
 * Show all the Training Program List        
 * getting Training Program by trainingCode        
 * Adding a Training Program         
 * Delete a training Program
 * Getting Training Program By Id
 *         
 */
public interface TrainingProgramMaintainance {

	// Training Program specific functions
	List<TrainingProgram> getAllTrainingProgram();

	TrainingProgram getTrainingProgramById(Integer trainingCode);

	TrainingProgram addTrainingProgram(TrainingProgram trainingProgram);

	Boolean deleteTrainingProgram(Integer trainingCode);

	TrainingProgram getTrainingProgramByParticipantId(Integer participantId);

}
