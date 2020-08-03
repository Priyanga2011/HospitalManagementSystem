package com.sample.hospitalManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
@Entity
@Table(name= "PatientVitalInfo")
public class PatientVitalInformationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PatientID" , nullable=false)
	@ApiModelProperty(notes = "ID of the Patient which is provided by Admin")
	private int patientID;
	
	@Column(name="BloodPressure" , nullable=false)
	@ApiModelProperty(notes = "bloodPressure of the patient")
	private int bloodPressure;
	
	@Column(name="RespirationRate" , nullable=false)
	@ApiModelProperty(notes = "respirationRate of the patient")
	private int respirationRate;
	
	@Column(name="PulseRate" , nullable=false)
	@ApiModelProperty(notes = "pulseRate of the patient")
	private int pulseRate;
	
	@Column(name="BodyTemperature" , nullable=false)
	@ApiModelProperty(notes = "bodyTemperature of the patient")
	private int bodyTemperature;
	
	@Column(name="BloodSugarLevel" , nullable=false)
	@ApiModelProperty(notes = "bloodSugarLevel of the patient")
	private int bloodSugarLevel;
	
	@Column(name="Height" , nullable=false)
	@ApiModelProperty(notes = "height of the patient")
	private int height;
	
	@Column(name="Weight" , nullable=false)
	@ApiModelProperty(notes = "weight of the patient")
	private int weight;
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		patientID = patientID;
	}
	public int getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public int getRespirationRate() {
		return respirationRate;
	}
	public void setRespirationRate(int respirationRate) {
		this.respirationRate = respirationRate;
	}
	public int getPulseRate() {
		return pulseRate;
	}
	public void setPulseRate(int pulseRate) {
		this.pulseRate = pulseRate;
	}
	public int getBodyTemperature() {
		return bodyTemperature;
	}
	public void setBodyTemperature(int bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}
	public int getBloodSugarLevel() {
		return bloodSugarLevel;
	}
	public void setBloodSugarLevel(int bloodSugarLevel) {
		this.bloodSugarLevel = bloodSugarLevel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
