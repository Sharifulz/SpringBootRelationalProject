package com.exam.model;

import java.util.List;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="BT5_STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id_student;
	String tx_name;
	String tx_email;
	String tx_password;
	String tx_gender;
	String tx_designation;
	int student_status;
	 @OneToMany
	 @JoinColumn(name = "student_id",insertable=false,  updatable=false, nullable = false, foreignKey = @ForeignKey(name = "Details_FK"))
	 List<SecurityDetails> details;	
}
