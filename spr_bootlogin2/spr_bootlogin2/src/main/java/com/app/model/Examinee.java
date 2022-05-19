package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examinee124")
public class Examinee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 long examinee_id;
	 String examinee_name;
	 int age;
	 long contact_number;
	public Examinee(long examinee_id, String examinee_name, int age, long contact_number) {
		super();
		this.examinee_id = examinee_id;
		this.examinee_name = examinee_name;
		this.age = age;
		this.contact_number = contact_number;
	}
	public Examinee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getExaminee_id() {
		return examinee_id;
	}
	public void setExaminee_id(long examinee_id) {
		this.examinee_id = examinee_id;
	}
	public String getExaminee_name() {
		return examinee_name;
	}
	public void setExaminee_name(String examinee_name) {
		this.examinee_name = examinee_name;
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
