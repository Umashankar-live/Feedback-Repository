/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:27:44 AM
 */
package com.cg.beans;

/**
 * @author Shivani
 *
 */

public class Faculty {
	
	private int facultyId;
	
	
	private String facultyName;
	
	private String[] skills;
	/**
	 * Default Constructor
	 */
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the facultyId
	 */
	public int getFacultyId() {
		return facultyId;
	}

	/**
	 * @param facultyId the facultyId to set
	 */
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	/**
	 * @return the facultyName
	 */
	public String getFacultyName() {
		return facultyName;
	}

	/**
	 * @param facultyName the facultyName to set
	 */
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	

	
}
