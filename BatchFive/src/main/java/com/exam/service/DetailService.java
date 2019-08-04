package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.DetailsRepo;
import com.exam.model.Question;
import com.exam.model.SecurityDetails;
@Service
public class DetailService {

	@Autowired
	DetailsRepo repo;
	public List<SecurityDetails> getAllStu(){
		return repo.findAll();
	}
	public void doSaveStu(SecurityDetails details) {
		repo.save(details);
	}
	public void doUpdate(SecurityDetails details) {
		repo.saveAndFlush(details);
	}
	public void doDelete(SecurityDetails details) {
		repo.delete(details);
	}
}
