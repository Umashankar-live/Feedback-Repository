package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bean.TrainingProgram;



/**
 * @author Uma Shankar
 *
 * 04-May-2020 2:35:28 pm
 */
@Repository
public interface TrainingProgramRepository extends JpaRepository<TrainingProgram, Integer> {

}
