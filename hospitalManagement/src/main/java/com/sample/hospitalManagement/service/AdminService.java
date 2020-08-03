package com.sample.hospitalManagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.hospitalManagement.Entity.PatientBasicDetailsEntity;
import com.sample.hospitalManagement.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;

	public List<PatientBasicDetailsEntity> getPatient() {
		List<PatientBasicDetailsEntity> user = (List<PatientBasicDetailsEntity>) repository.findAll();
		return user;

	}

	public void addPatient(PatientBasicDetailsEntity user) {
		repository.save(user);
	}

	public Optional<PatientBasicDetailsEntity> getByPatientID(Integer id) {
		return repository.findById(id);
	}

	public void deletePatient(Integer id) {
		repository.deleteById(id);
	}
}
