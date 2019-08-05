package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Student;
import com.exam.service.StudentService;

@RestController()
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/allStudent")
	public List<Student> getAllStudents(){
		return service.getAllStu();
	}
	@PostMapping("/saveStudent")
	public void doSave(@RequestBody Student student) {
		service.doSaveStu(student);
	}
	@PutMapping("/updateStudent")
	public void doUpdate(@RequestBody Student student) {
		service.doUpdate(student);
	}
	@DeleteMapping("/deleteStudent")
	public void doDelete(@RequestBody Student student) {
		service.doDelete(student);
	}
}
