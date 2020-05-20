/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:34:22 PM
 */
package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Feedback;
import com.cg.dao.FeedbackDao;

/**
 * @author Shivani
 *
 */
@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	
	
	@Autowired
	FeedbackDao feedbackDao;
	
	@Override
	public Feedback addFeedback(Feedback feedback) {
		return this.feedbackDao.save(feedback);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return this.feedbackDao.findAll();
	}

	@Override
	public List<Feedback> getFeedbackByFacultyId(Integer facultyId) {
		return this.feedbackDao.findAll().stream().filter(f->f.getFacultyId()==facultyId).collect(Collectors.toList());
	}

	@Override
	public List<Feedback> getFeedbackByTrainingProgram(Integer trainingCode) {
		return this.feedbackDao.findAll().stream().filter(f->f.getTrainingCode()==trainingCode).collect(Collectors.toList());
		
	}

}
