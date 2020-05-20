package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Employee;
import com.cg.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl service;

	//http://localhost:8034/employee/addemployee
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee e) {
		
		// checking whether the value exist previously
		List<Employee> allList = this.service.getallEmployee();
		for (int i = 0; i < allList.size(); i++) {
			if(allList.get(i).getEmployeeName().equalsIgnoreCase(e.getEmployeeName())) {
				return null;
			}
		}
		Employee employee = service.addEmployee(e);
		return employee;
	}
	
	
	//http://localhost:8034/employee/getAllEmployees
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployee(){
		return this.service.getallEmployee();
	}
	
	//http://localhost:8034/employee/employeebyid/{empId}
	@GetMapping("/employeebyid/{empId}")
	public Employee getEmployeeById(@PathVariable(value = "empId")int empId) {
		return this.service.checkRole(empId);
		
	}
	
	//http://localhost:8034/employee/getAllParticipantList
	@GetMapping("/getAllParticipantList")
	public List<Employee> getAllParticipantList() {
		return this.service.getAllParticipant();
	}

	

}
