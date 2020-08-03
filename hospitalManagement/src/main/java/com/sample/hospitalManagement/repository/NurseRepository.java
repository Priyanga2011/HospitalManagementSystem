package com.sample.hospitalManagement.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.hospitalManagement.Entity.PatientVitalInformationEntity;

public interface NurseRepository  extends JpaRepository<PatientVitalInformationEntity, Integer>{

	Optional<PatientVitalInformationEntity> findBypatientID(Integer id);
	
	@Transactional
	Integer deleteBypatientID(Integer id);
	 
}
