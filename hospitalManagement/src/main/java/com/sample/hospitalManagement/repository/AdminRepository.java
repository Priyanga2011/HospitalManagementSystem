package com.sample.hospitalManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.hospitalManagement.Entity.PatientBasicDetailsEntity;
@Repository
public interface AdminRepository extends JpaRepository<PatientBasicDetailsEntity, Integer>{

	Optional<PatientBasicDetailsEntity> findById(Integer id);
	 
}
