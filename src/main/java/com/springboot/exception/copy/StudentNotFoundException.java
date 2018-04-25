package com.springboot.exception.copy;

public class StudentNotFoundException extends RuntimeException {

	  public StudentNotFoundException(String exception) {
	    super(exception);
	  }
}
