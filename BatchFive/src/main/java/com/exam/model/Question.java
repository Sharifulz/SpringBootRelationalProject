package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_QUESTION")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String question;
}
