package com.cg.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.ParticipantEnrolled;

/**
 * @author Win10
 *
 */
public interface ParticipantEnrolledRepository extends JpaRepository<ParticipantEnrolled, Integer> {

	@Transactional
	long deleteBytrainingCode(Integer trainingCode);

}
