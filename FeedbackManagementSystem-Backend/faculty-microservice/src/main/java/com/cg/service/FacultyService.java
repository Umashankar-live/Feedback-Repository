/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:34:43 PM
 */
package com.cg.service;

import java.util.List;

import com.cg.beans.Faculty;

/**
 * @author Shivani
 *
 *Add Faculty
 *List All Faculty
 *Get Faculty by Id
 *Delete Faculty By Id
 */


public interface FacultyService {
	
	Faculty addFaculty(Faculty faculty);
	List<Faculty> getAllFaculty();
	Faculty getFacultyById(Integer facultyId);
	Boolean deleteFacultyById(Integer facultyId);
	//update
	
}
