package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Question;
import com.exam.model.Student;
import com.exam.service.QuestionService;

@RestController("/question")
public class QuestionController {

	@Autowired
	QuestionService service;
	
	@GetMapping("/allQuestion")
	public List<Question> getAllStudents(){
		return service.getAllStu();
	}
	@PostMapping("/saveQuestion")
	public void doSave(@RequestBody Question question) {
		service.doSaveStu(question);
	}
	@PutMapping("/updateQuestion")
	public void doUpdate(@RequestBody Question question) {
		service.doUpdate(question);
	}
	@DeleteMapping("/deleteQuestion")
	public void doDelete(@RequestBody Question question) {
		service.doDelete(question);
	}
}
