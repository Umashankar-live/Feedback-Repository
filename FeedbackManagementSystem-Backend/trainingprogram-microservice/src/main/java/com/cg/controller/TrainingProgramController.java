/**
 * 
 */
package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.bean.Course;
import com.cg.bean.Faculty;
import com.cg.bean.TrainingProgram;
import com.cg.bean.TrainingProgramDate;
import com.cg.service.ParticipantEnrollMaintainance;
import com.cg.service.TrainingProgramMaintainance;

/**
 * @author Uma Shankar
 *
 *         06-May-2020 7:44:11 pm
 */
@RestController
@CrossOrigin("http://localhost:4200")
public class TrainingProgramController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	TrainingProgramMaintainance trainingProgramMaintainance;
	
	@Autowired
	ParticipantEnrollMaintainance participantEnrollService ;

	// http://localhost:5056/coordinator/getAllTrainingProgramList
	@GetMapping("/coordinator/getAllTrainingProgramList")
	public List<TrainingProgram> getAllTrainingProgramList() {
		return this.trainingProgramMaintainance.getAllTrainingProgram();
	}

	// http://localhost:5056/coordinator/getTrainingById/{id}
	@GetMapping("/coordinator/getTrainingById/{id}")
	public TrainingProgram getTrainingProgramById(@PathVariable(value = "id") Integer trainingCode) {
		TrainingProgram trainingProgram = this.trainingProgramMaintainance.getTrainingProgramById(trainingCode);
		return trainingProgram;
	}

	// http://localhost:5056/coordinator/addTrainingProgram/{courseId}/{facultyId}
	@PostMapping("/coordinator/addTrainingProgram/{courseId}/{facultyId}")
	public TrainingProgram createTrainingProgram(@RequestBody TrainingProgramDate trainingProgramDate,
			@PathVariable(value = "courseId") Integer courseId, @PathVariable(value = "facultyId") Integer facultyId) {

		Course course = restTemplate.getForObject("http://localhost:5057/admin/getCourseById/"+courseId, Course.class);
		System.out.println(course.getCourseId());

		Faculty faculty = restTemplate.getForObject("http://localhost:5053/faculty/getFacultyById/"+facultyId, Faculty.class);
		System.out.println(faculty.getFacultyId());

		TrainingProgram tp = new TrainingProgram();

		tp.setStartDate(trainingProgramDate.getStartDate());
		tp.setEndDate(trainingProgramDate.getEndDate());
		tp.setCourseName(course.getCourseName());
		tp.setFacultyName(faculty.getFacultyName());
		tp.setFacultyId(faculty.getFacultyId());

		System.out.println(tp);
		return this.trainingProgramMaintainance.addTrainingProgram(tp);

	}

	// http://localhost:5056/coordinator/deleteTrainingProgram/{id}
	@DeleteMapping("/coordinator/deleteTrainingProgram/{id}")
	public Boolean deleteTrainingProgram(@PathVariable(value = "id") Integer trainingCode) {
		this.participantEnrollService.deleteAllEnrolledParticipant(trainingCode);
		return this.trainingProgramMaintainance.deleteTrainingProgram(trainingCode);
	}


}
