package com.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.exception.copy.StudentNotFoundException;
import com.springboot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
		}
	
	@GetMapping(value="/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
}
