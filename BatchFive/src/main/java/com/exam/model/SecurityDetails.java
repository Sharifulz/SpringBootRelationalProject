package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_DETAILS")
public class SecurityDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	int uid;
	int qid;
	String answer;
	@ManyToOne
    @JoinColumn(name = "student_id")
    Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public SecurityDetails(int id, int uid, int qid, String answer, Student student) {

		this.id = id;
		this.uid = uid;
		this.qid = qid;
		this.answer = answer;
		this.student = student;
	}
	public SecurityDetails() {
	
	}
	
	
	
	
	
}
