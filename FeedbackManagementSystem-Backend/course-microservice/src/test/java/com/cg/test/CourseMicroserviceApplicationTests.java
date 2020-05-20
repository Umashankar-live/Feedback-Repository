package com.cg.test;


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

import com.cg.bean.Course;
import com.cg.dao.CourseRepository;
import com.cg.service.CourseMaintainance;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseMicroserviceApplicationTests {

	@Autowired
	private CourseMaintainance courseService ;

	@MockBean
	private CourseRepository courseDao ;

	@Test
	public void getCourseTest() {
		when(courseDao.findAll()).thenReturn(Stream
				.of(new Course(1, "Java", 15),new Course(1, "AWS", 20),new Course(1, "Python", 12)).collect(Collectors.toList()));
		System.out.println(courseService.getAllCourses());
		assertEquals(3, courseService.getAllCourses().size());
	}

//	@Test
//	public void getCourseById() {
//		//Integer CourseId = 1;
//	
//		when(courseDao.findById(1).get())
//				.thenReturn(new Course(1, "Python", 45));
//		Course course = courseService.getCourseById(1);
//		System.out.println(course);
//	assertEquals("Python", course.getCourseName());
//	}

	@Test
	public void saveCourseTest() {
		Course course = new Course(2, "Spring", 20);
		when(courseDao.save(course)).thenReturn(course);
		assertEquals(course, courseService.addCourse(course));
	}
	
	
	@Test
	public void deleteCourseTest() {
		Course course = new Course(1, "Angular", 15);
		courseService.deleteCourse(1);
		verify(courseDao, times(1)).deleteById(course.getCourseId());
	}
	
	
	
}
