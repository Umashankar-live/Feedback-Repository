package com.cg.service;

import java.util.List;

import com.cg.beans.Employee;
/**
 * Add Employee
 * Delete Employee
 * Check Role
 * Get All Participant
 * 
 *
 */
public interface EmployeeService {
	
	public Employee addEmployee(Employee e);
	public List<Employee> getallEmployee();
	public boolean deleteEmployee(int empId);
	public Employee checkRole(int empId);
	public List<Employee> getAllParticipant();

}
