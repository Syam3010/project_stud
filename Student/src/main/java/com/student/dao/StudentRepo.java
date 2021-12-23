package com.student.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.entities.Student;

public interface StudentRepo extends MongoRepository<Student, String>{

}
