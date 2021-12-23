package com.student.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "students_details")
public class Student {

	@Id
	private String id;
	//private String admNo;
	@Indexed(direction = IndexDirection.ASCENDING)
	private String name;
	private String gender;
	private String division;
	private String clas;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date birthDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, String gender, String division, String clas, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.division = division;
		this.clas = clas;
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", division=" + division + ", clas="
				+ clas + ", birthDate=" + birthDate + "]";
	}
	
	
		
}
