package com.cg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.Faculty;
import com.cg.dao.FacultyDao;
import com.cg.service.FacultyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacultyMicroserviceApplicationTests {

	@Autowired
	private FacultyService service;

	@MockBean
	private FacultyDao repository;

	@Test
	public void getAllFaculties() {
		when(repository.findAll()).thenReturn(Stream.of(new Faculty(3, "Uma", null)).collect(Collectors.toList()));
		assertEquals(1, service.getAllFaculty().size());
	}

//	@Test
//	public void getUserbyAddressTest() {
//		String address = "Bangalore";
//		when(repository.findByAddress(address))
//				.thenReturn(Stream.of(new User(376, "Danile", 31, "USA")).collect(Collectors.toList()));
//		assertEquals(1, service.getUserbyAddress(address).size());
//	}
//
	@Test
	public void saveFacultyTest() {
		Faculty faculty = new Faculty(3, "Uma", null);
		when(repository.save(faculty)).thenReturn(faculty);
		assertEquals(faculty, service.addFaculty(faculty));
	}

	@Test
	public void deleteFacultyTest() {
		Faculty faculty = new Faculty(3, "Uma", null);
		service.deleteFacultyById(faculty.getFacultyId());
		verify(repository, times(1)).deleteById(faculty.getFacultyId());
	}

}