
package com.cg.bean;

/**
 * @author Uma Shankar
 *
 * 06-May-2020 9:07:28 pm
 */
//POJO
public class Employee {
	
	private Integer employeeId;


	private String employeeName;


	private String password;


	private String role;

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
