package com.exam.model;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int student_id;
	String name;
	String email;
	String password;
	String gender;
	String designation;
	

	 @OneToMany(mappedBy = "id", cascade=CascadeType.ALL)
	 Set<SecurityDetails> details;
	 

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Set<SecurityDetails> getDetails() {
		return details;
	}

	public void setDetails(Set<SecurityDetails> details) {
		this.details = details;
	}

	public Student(int student_id, String name, String email, String password, String gender, String designation) {
	
		this.student_id = student_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.designation = designation;
		this.details = details;
	}

	public Student() {
	}
	
	
	
}
