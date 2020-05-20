package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.bean.Employee;
import com.cg.bean.ParticipantEnrolled;
import com.cg.bean.TrainingProgram;
import com.cg.service.ParticipantEnrollMaintainance;
import com.cg.service.TrainingProgramMaintainance;

/**
 * @author Win10
 *
 */
@RestController
@RequestMapping("/coordinator")
@CrossOrigin("http://localhost:4200")
public class ParicipantEnrollmentController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	TrainingProgramMaintainance trainingProgramMaintainance;

	@Autowired
	ParticipantEnrollMaintainance participantEnrollService;

	// http://localhost:5056/coordinator/participantenroll/{empId}/{tId}
	@RequestMapping("/participantenroll/{empId}/{tId}")
	private ParticipantEnrolled getObjectOfEmployee(@PathVariable(value = "empId") Integer empId,
			@PathVariable(value = "tId") Integer tId) {

		Employee employee = restTemplate.getForObject("http://localhost:8034/employee/employeebyid/" + empId,
				Employee.class);
		System.out.println(employee.getRole());

		TrainingProgram tp = trainingProgramMaintainance.getTrainingProgramById(tId);

		return participantEnrollService.enrollParticipant(employee, tp);
	}

	// http://localhost:5056/coordinator/participantenroll/gettrainingprogram/
	@RequestMapping("/participantenroll/gettrainingprogram/{empId}")
	private TrainingProgram getTrainingProgramByParticipantId(@PathVariable(value = "empId") Integer empId) {
		return trainingProgramMaintainance.getTrainingProgramByParticipantId(empId);
	}

	// http://localhost:5056/coordinator/getAllParticipantEnrolled
	@GetMapping("/getAllParticipantEnrolled")
	private List<ParticipantEnrolled> getAllParticipantEnrolled() {
		return participantEnrollService.getAllParticipantEnrolled();
	}

	// http://localhost:5056/coordinator/deleteParticipantById/{empId}
	@DeleteMapping("deleteParticipantById/{empId}")
	public void deleteFacultyById(@PathVariable Integer empId) {
		this.participantEnrollService.deleteParticipantEnrolled(empId);
	}

}