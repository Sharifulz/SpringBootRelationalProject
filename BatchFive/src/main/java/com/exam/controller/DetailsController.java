package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dao.DetailsRepo;
import com.exam.model.Question;
import com.exam.model.SecurityDetails;
import com.exam.service.DetailService;

@RestController("/detail")
public class DetailsController {

	@Autowired
	DetailService service;
	
	@GetMapping("/allDetail")
	public List<SecurityDetails> getAllStudents(){
		return service.getAllStu();
	}
	@PostMapping("/saveDetail")
	public void doSave(@RequestBody SecurityDetails details) {
		service.doSaveStu(details);
	}
	@PutMapping("/updateDetail")
	public void doUpdate(@RequestBody SecurityDetails details) {
		service.doUpdate(details);
	}
	@DeleteMapping("/deleteDetail")
	public void doDelete(@RequestBody SecurityDetails details) {
		service.doDelete(details);
	}
}
