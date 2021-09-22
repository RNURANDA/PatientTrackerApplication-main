package com.patientTracker.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TreatmentHistoryNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID =1L;
	
	public TreatmentHistoryNotFoundException() {
		super();
	}

}
