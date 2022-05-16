package com.app.model;
import java.sql.*;
import java.time.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam_Taken1")

public class ExamTaken1 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int taken_id;
	int  exam_id;
	int examine_id;
	Date edate = Date.valueOf(LocalDate.now());
	public int getTakenId() {
		return taken_id;
	}
	public void setTakenId(int taken_id) {
		this.taken_id = taken_id;
	}
	public int getExamId() {
		return exam_id;
	}
	public void setExamId(int exam_id) {
		this.exam_id= exam_id;
	}
	public int getExamineId() {
		return examine_id;
	}
	public void setExamineId(int examine_id) {
		this.examine_id= examine_id;
	}
	public Date getDate()
	{
		return edate;
	}
	public void setDate(Date edate) {
		this.edate = edate;
	}
	
	public ExamTaken1(int taken_id,int exam_id,int examine_id,Date edate) {
		super();
		this.taken_id = taken_id;
		this.exam_id = exam_id;
		this.examine_id = examine_id;
		this.edate = edate;
	}
	public ExamTaken1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}