package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam124")
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int exam_id;
	String subject_name;
	String description;

	public Exam(int exam_id, String subject_name, String description, String provider) {
		super();
		this.exam_id = exam_id;
		this.subject_name = subject_name;
		this.description = description;
		
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}