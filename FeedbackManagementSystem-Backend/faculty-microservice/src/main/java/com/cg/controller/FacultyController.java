/**
 * @author Shivani
 * @data May 7, 2020
 * @time 6:07:13 PM
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Faculty;
import com.cg.service.FacultyService;

/**
 * @author Shivani
 *
 */
@RestController
@RequestMapping("/faculty")
@CrossOrigin("http://localhost:4200")
public class FacultyController {

	
	@Autowired
	FacultyService facultyService;
	
	//http://localhost:5053/faculty/addFaculty
	@PostMapping("/addFaculty")
	public Faculty addFaculty(@RequestBody Faculty faculty) {
		return facultyService.addFaculty(faculty);
	}
	
	//http://localhost:5053/faculty/getAllFaculty
	@GetMapping("/getAllFaculty")
	public List<Faculty> getAllFaculty(){
		return facultyService.getAllFaculty();
	}
	
	//http://localhost:5053/faculty/deleteFaculty/{facultyId}
	@DeleteMapping("/deleteFaculty/{facultyId}")
	public Boolean deleteFacultyById(@PathVariable Integer facultyId) {
		return facultyService.deleteFacultyById(facultyId);
	}
	
	//http://localhost:5053/faculty/getFacultyById/{facultyId}
	@GetMapping("/getFacultyById/{facultyId}")
	public Faculty getfacultyById(@PathVariable Integer facultyId){
		return facultyService.getFacultyById(facultyId);
	}

}
