package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examinees")
public class Examinees {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 long examinees_id;
	 String examinees_name;
	 int age;
	 long contact_number;
	public Examinees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examinees(String examinees_name, int age, long contact_number) {
		super();
		this.examinees_name = examinees_name;
		this.age = age;
		this.contact_number = contact_number;
	}
	public long getExaminees_id() {
		return examinees_id;
	}
	public void setExaminees_id(long examinees_id) {
		this.examinees_id = examinees_id;
	}
	public String getExaminees_name() {
		return examinees_name;
	}
	public void setExaminees_name(String examinees_name) {
		this.examinees_name = examinees_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
}
