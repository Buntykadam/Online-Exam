package com.app.model;
import java.sql.*;
import java.time.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam_Reports1")

public class ExamReports{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int report_id;
	Date rdate = Date.valueOf(LocalDate.now());
	int examine_id;
	int  exam_id;
	int taken_id;
	
	
	
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public int getExamine_id() {
		return examine_id;
	}
	public void setExamine_id(int examine_id) {
		this.examine_id = examine_id;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public int getTaken_id() {
		return taken_id;
	}
	public void setTaken_id(int taken_id) {
		this.taken_id = taken_id;
	}
	public ExamReports(int report_id,Date rdate,int examine_id,int exam_id,int taken_id) {
		super();
		this.report_id = report_id;
		this.rdate = rdate;
		this.examine_id = examine_id;
		this.exam_id = exam_id;
		this.taken_id = taken_id;
		
	}
	public ExamReports() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}