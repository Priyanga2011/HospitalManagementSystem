package com.sample.hospitalManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PatientBasicDetails")
public class PatientBasicDetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PatientId", updatable=false, nullable=false)
	private int id;
	

	@Embedded
	private PatientFullNameEntity fullName;
	
	@Column(name="PatientMailId", nullable=false)
	private String mailId;
	
	@Column(name="Nationality", nullable=false)
	private String nationality;
	
	@Column(name="ContactNumber", nullable=false)
	private int contactNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PatientFullNameEntity getFullName() {
		return fullName;
	}

	public void setFullName(PatientFullNameEntity fullName) {
		this.fullName = fullName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setName(String nationality) {
		this.nationality = nationality;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}



}
