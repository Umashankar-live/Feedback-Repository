/**
 * @author Tanmay
 * @data May 4, 2020
 * @time 10:47:40 AM
 */
package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Tanmay
 *
 */

@Entity
@Table(name ="EMPLOYEE_MASTER")
public class Employee {
	@Id
	@Column(name="Employee_Id")
	private Integer employeeId;
	
	@Column(name="Employee_Name")
	private String employeeName;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String employeeName, String password, String role) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.role = role;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
