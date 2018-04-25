package com.springboot.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springboot.entity.Student;
import com.springboot.exception.copy.StudentNotFoundException;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1, "Rahul", "CSE"));
				put(2, new Student(2, "Ajay", "CSE"));
			}
		};
		
		
		
		
	}
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	public Student getStudentById(Integer id){
		Student stu= students.get(id);
		if(stu==null)
		throw new StudentNotFoundException("Student not found");
		else
		return students.get(id);
	}
}
