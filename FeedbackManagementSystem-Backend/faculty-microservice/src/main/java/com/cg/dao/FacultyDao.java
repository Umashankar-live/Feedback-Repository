/**
 * @author Shivani
 * @data May 5, 2020
 * @time 9:52:38 AM
 */
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.Faculty;

/**
 * @author Shivani
 *
 */
public interface FacultyDao extends JpaRepository<Faculty, Integer>{

}
