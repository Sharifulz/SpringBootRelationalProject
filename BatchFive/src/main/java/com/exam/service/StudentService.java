package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.StudentRepository;
import com.exam.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public List<Student> getAllStu(){
		return repo.findAll();
	}
	public void doSaveStu(Student student) {
		repo.save(student);
	}
	public void doUpdate(Student student) {
		repo.saveAndFlush(student);
	}
	public void doDelete(Student student) {
		repo.delete(student);
	}
}
