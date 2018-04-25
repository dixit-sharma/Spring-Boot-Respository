package com.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.exception.copy.StudentNotFoundException;

@ControllerAdvice
public class ApplicationException {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleStudentNotFoundException(StudentNotFoundException exception) {
		 ErrorMessage errorMessage= new ErrorMessage("Student not found for the entered id");
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}																						

}	
