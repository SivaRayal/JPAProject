package com.ssk.springjpaassignment.exception;

public class ProjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ProjectNotFoundException() {
		super();
	}
	
	public ProjectNotFoundException(String message) {
		super(message);
	}

}
