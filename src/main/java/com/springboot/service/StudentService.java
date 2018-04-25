package com.springboot.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentDao;
import com.springboot.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
		}
	
	
	public Student getStudentById(Integer id) {
		return studentDao.getStudentById(id);
	}
}
