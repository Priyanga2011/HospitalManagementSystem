package com.sample.hospitalManagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.hospitalManagement.Entity.PatientVitalInformationEntity;
import com.sample.hospitalManagement.repository.NurseRepository;

@Service
public class NurseService {
	
	@Autowired
	private NurseRepository repository;
	
	public List<PatientVitalInformationEntity> getAllPatientDetails(){
		List<PatientVitalInformationEntity> patientinfo = repository.findAll();
		return patientinfo;
	}
	
	public void addPatientVitalInfo(PatientVitalInformationEntity user)
	{
		repository.save(user);
	}

	public Optional<PatientVitalInformationEntity> getByPatientID(Integer id){
		return repository.findBypatientID(id);
	}
	
	public void deletePatientVitalInfo(Integer id) {
		repository.deleteBypatientID(id);
	}
	
}
