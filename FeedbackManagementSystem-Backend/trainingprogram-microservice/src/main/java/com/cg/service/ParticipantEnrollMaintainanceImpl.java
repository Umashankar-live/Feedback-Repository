package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.bean.ParticipantEnrolled;
import com.cg.bean.TrainingProgram;
import com.cg.dao.ParticipantEnrolledRepository;

@Service
public class ParticipantEnrollMaintainanceImpl implements ParticipantEnrollMaintainance {

	@Autowired
	ParticipantEnrolledRepository participantEnrolledDao;

	@Override
	public ParticipantEnrolled enrollParticipant(Employee employee, TrainingProgram tp) {
		ParticipantEnrolled partEnrolled = new ParticipantEnrolled();
		partEnrolled.setParticipantId(employee.getEmployeeId());
		partEnrolled.setParticipantName(employee.getEmployeeName());
		partEnrolled.setTrainingCode(tp.getTrainingCode());
		partEnrolled.setCourseName(tp.getCourseName());
		partEnrolled.setFacultyName(tp.getFacultyName());
		return participantEnrolledDao.save(partEnrolled);

	}

	@Override
	public List<ParticipantEnrolled> getAllParticipantEnrolled() {
		return this.participantEnrolledDao.findAll();
	}

	@Override
	public void deleteAllEnrolledParticipant(Integer trainingCode) {
		this.participantEnrolledDao.deleteBytrainingCode(trainingCode);

	}

	@Override
	public void deleteParticipantEnrolled(Integer empId) {
		this.participantEnrolledDao.deleteById(empId);

	}
}
