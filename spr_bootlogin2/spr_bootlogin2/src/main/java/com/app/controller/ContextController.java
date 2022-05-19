package com.app.controller;

import java.util.List;


import com.app.model.AdminLogin;
import com.app.model.Question;
import com.app.model.Exam;
import com.app.model.ExamResult;
import com.app.model.User;


public class ContextController {

	public static User user;
	public static AdminLogin admin;
	public static ExamResult examresult;
	public static Exam exam;
	public static List<Question> questions;
	public static User getUser() {
		return user;
	}
	
	public static AdminLogin getAdmin() {
		return admin;
	}

	public static void setAdmin(AdminLogin admin) {
		ContextController.admin = admin;
	}

	public static ExamResult getExamresult() {
		return examresult;
	}

	public static void setExamresult(ExamResult examresult) {
		ContextController.examresult = examresult;
	}

	public static Exam getExam() {
		return exam;
	}

	public static void setExam(Exam exam) {
		ContextController.exam = exam;
	}

	public static List<Question> getQuestions() {
		return questions;
	}

	public static void setQuestions(List<Question> questions) {
		ContextController.questions = questions;
	}

	public static void setUser(User user) {
		ContextController.user = user;
	}

	public static ExamResult getExamResult() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
