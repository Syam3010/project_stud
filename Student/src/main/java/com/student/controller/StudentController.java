package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.student.entities.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		//super();
		this.studentService = studentService;
	}
	
	@GetMapping(path="students", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getAllStudents(){
		return ResponseEntity.ok(studentService.getAllStudents());
	}
	
	@GetMapping("student/{id}")
	public ResponseEntity<Student> getAnUser(@PathVariable ("id") String id){
		return ResponseEntity.ok(studentService.getStudentById(id));
	}
	
	@PostMapping(path="register")
	public String registerStudent(@RequestBody Student student) {
		Student users = new Student();
		users.setName(student.getName());
		users.setGender(student.getGender());
		users.setGender(student.getGender());
		users.setDivision(student.getDivision());
		users.setClas(student.getClas());
		users.setBirthDate(student.getBirthDate());
		studentService.saveUser(student);
		return "redirect:students";
	}
	
	

}
