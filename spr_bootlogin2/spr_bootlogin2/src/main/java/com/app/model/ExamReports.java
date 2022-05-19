package com.app.model;
import java.sql.*;
import java.time.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam_Reports124")

public class ExamReports{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int report_id;
	String rdate;
	int examinee_id;
	int  exam_id;
	
	
	
	
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getExamine_id() {
		return examinee_id;
	}
	public void setExamine_id(int examine_id) {
		this.examinee_id = examine_id;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	
	public ExamReports(int report_id,String rdate,int examinee_id,int exam_id) {
		super();
		this.report_id = report_id;
		this.rdate = rdate;
		this.examinee_id = examinee_id;
		this.exam_id = exam_id;
		
		
	}
	public ExamReports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}