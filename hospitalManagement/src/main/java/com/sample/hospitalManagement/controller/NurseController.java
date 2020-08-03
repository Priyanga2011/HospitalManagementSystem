package com.sample.hospitalManagement.controller;

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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.sample.hospitalManagement.Entity.PatientVitalInformationEntity;
import com.sample.hospitalManagement.service.NurseService;

@RestController
@RequestMapping("/nurse")
@Api(value="NurseController", description="Patient Vital Information")
public class NurseController {

	@Autowired
	private NurseService service;
	
	 @ApiOperation(value = "List of patient with vital Information",response = Iterable.class)
	 @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Successfully retrieved the Patient list"),
	            @ApiResponse(code = 401, message = "You are not authorized to view the patient list"),
	            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    }
	    )
	@GetMapping("/getPatientFullDetails")
	public ResponseEntity<Object>  getAllPatientDetails(){
		return new ResponseEntity<>(service.getAllPatientDetails(),HttpStatus.OK);
	}
	
	 @ApiOperation(value = "Add a Patient Vital Info")
	@PostMapping("/addPatientVitalDetails")
	public ResponseEntity<Object> addPatientVitalInfo(@RequestBody PatientVitalInformationEntity patientdetails){
		service.addPatientVitalInfo(patientdetails);
		 return new ResponseEntity<>("Patient Vital Information Record Successfully",HttpStatus.CREATED);
	}

	@ApiOperation(value = "Search a patient with an ID",response = PatientVitalInformationEntity.class)
	@GetMapping("/getPatientVitalInfoById/{id}")
	public Optional<PatientVitalInformationEntity> getByPatientID(@PathVariable Integer id){
		return service.getByPatientID(id);
	}
	
	@ApiOperation(value = "Delete the patient")
	@DeleteMapping("/deletePatientVitalInfo/{id}")
	public ResponseEntity<Object> deletePatientVitalInfo(@PathVariable Integer id) {
		service.deletePatientVitalInfo(id);
		return new ResponseEntity<>( "patient vital details delete successfully",HttpStatus.OK);
	}
	

}
