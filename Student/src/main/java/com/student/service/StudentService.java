package com.student.service;

import java.util.List;

import com.student.entities.Student;
public interface StudentService {
	
	public List<Student> getAllStudents();
	 public void saveUser(Student student);
	 public Student getStudentById(String id);

}
