package com.sample.hospitalManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PatientFullNameEntity {

	@Column(name="PatientFirstName", nullable=false)
	private String firstName;
	@Column(name="PatientMiddleName", nullable=false)
	private String middleName;
	@Column(name="PatientLastName", nullable=false)
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
