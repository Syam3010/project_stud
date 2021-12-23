package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.StudentRepo;
import com.student.entities.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	public StudentServiceImpl(StudentRepo studentRepo) {
		//super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void saveUser(Student student) {
		// TODO Auto-generated method stub
	     studentRepo.save(student);
	}

	@Override
	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).orElseThrow(StudentNotFoundException:: new);
	}

}
