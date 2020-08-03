package com.sample.hospitalManagement.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.hospitalManagement.Entity.PatientBasicDetailsEntity;
import com.sample.hospitalManagement.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/admin")
@Api(value = "AdminController", description = "Patient Basic Details")
public class AdminController {

	
	@Autowired
	private AdminService service;

	@ApiOperation(value = "List of patient with basic details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved the Patient list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the patient list"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/getPatient")
	public List<PatientBasicDetailsEntity> getPatient() {
		return service.getPatient();
	}

	@ApiOperation(value = "Add a Patient Basic Details")
	@PostMapping("/addPatient")
	public ResponseEntity<Object> addPatient(@RequestBody PatientBasicDetailsEntity patientdetails) {
		service.addPatient(patientdetails);
		return new ResponseEntity<>("Patient basic Record Successfully",HttpStatus.CREATED);
	}

	@ApiOperation(value = "Search a patient with an ID", response = PatientBasicDetailsEntity.class)
	@GetMapping("/getPatientById/{id}")
	public Optional<PatientBasicDetailsEntity> getByPatientID(@PathVariable Integer id) {
		return service.getByPatientID(id);
	}

	@ApiOperation(value = "Delete the patient")
	@DeleteMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable Integer id) {
		service.deletePatient(id);
		return "Patient details delete successfully";
	}

}
