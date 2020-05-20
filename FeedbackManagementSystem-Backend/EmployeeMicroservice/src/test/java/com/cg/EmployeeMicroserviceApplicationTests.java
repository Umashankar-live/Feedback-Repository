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

import com.cg.beans.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMicroserviceApplicationTests {

	@Autowired
	private EmployeeService service;

	@MockBean
	private EmployeeDao repository ;
	
	@Test
	public void getAllFaculties() {
		when(repository.findAll()).thenReturn(Stream.of(new Employee(1, "Umashankar", "12345", "admin")).collect(Collectors.toList()));
		assertEquals(1, service.getallEmployee().size());
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
	public void saveEmployeeTest() {
		Employee Employee = new Employee(1, "Shekhar", "12345", "participant");
		when(repository.save(Employee)).thenReturn(Employee);
		assertEquals(Employee, service.addEmployee(Employee));
	}

	@Test
	public void deleteEmployeeTest() {
		Employee Employee = new Employee(1,"Shivani","12345","coordinatorS");
		service.deleteEmployee(Employee.getEmployeeId());
		verify(repository, times(1)).deleteById(Employee.getEmployeeId());
	}



}
