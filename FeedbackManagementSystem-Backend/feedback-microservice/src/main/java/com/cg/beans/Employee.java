/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:47:40 AM
 */
package com.cg.beans;

/**
 * @author Shivani
 *
 */

public class Employee {

	private Integer employeeId;
	
	private String employeeName;
	
	private String password;
	
	private String role;
	
	/**
	 * Default Constructor 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param password
	 * @param role
	 */
	public Employee(Integer employeeId, String employeeName, String password, String role) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.role = role;
	}

	
}
