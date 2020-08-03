package com.sample.hospitalManagement.exceptions;

public class PatientVitalInfoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PatientVitalInfoNotFoundException(String message) {
		super(message);
	}
}
