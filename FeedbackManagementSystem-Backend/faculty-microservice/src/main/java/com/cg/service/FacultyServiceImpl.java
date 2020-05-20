/**
 * @author Shivani
 * @data May 7, 2020
 * @time 8:53:16 AM
 */
package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Faculty;
import com.cg.dao.FacultyDao;

/**
 * @author Shivani
 *
 */
@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	FacultyDao facultyDao;
	
	@Override
	public Faculty addFaculty(Faculty faculty) {
		return facultyDao.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		return facultyDao.findAll();
	}

	@Override
	public Faculty getFacultyById(Integer facultyId) {
		return facultyDao.findById(facultyId).get();
	}

	@Override
	public Boolean deleteFacultyById(Integer facultyId) {
	 this.facultyDao.deleteById(facultyId);
		return true ;
	}

}
