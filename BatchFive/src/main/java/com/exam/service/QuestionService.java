package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.QuestionReo;
import com.exam.model.Question;
import com.exam.model.Student;

@Service
public class QuestionService {

	@Autowired
	QuestionReo repo;
	
	public List<Question> getAllStu(){
		return repo.findAll();
	}
	public void doSaveStu(Question question) {
		repo.save(question);
	}
	public void doUpdate(Question question) {
		repo.saveAndFlush(question);
	}
	public void doDelete(Question question) {
		repo.delete(question);
	}
}
