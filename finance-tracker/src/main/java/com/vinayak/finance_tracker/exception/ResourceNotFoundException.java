package com.vinayak.finance_tracker.exception;

public class ResourceNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7979081761452660918L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}