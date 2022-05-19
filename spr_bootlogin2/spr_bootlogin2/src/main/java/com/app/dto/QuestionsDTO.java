package com.app.dto;

import java.util.List;

import com.app.model.Question;

public class QuestionsDTO {

	private String questionTitle;
	private String optionOne;
	private String optionTwo;
	private String optionThree;
	private String optionFour;
	private String correctAnswer;
	private String subject;
	private Long questionId;
	
	public QuestionsDTO() {
		
	}
	
	public QuestionsDTO(String questionTitle, String optionOne, String optionTwo, String optionThree,
			String optionFour) {
		super();
		this.questionTitle = questionTitle;
		this.optionOne = optionOne;
		this.optionTwo = optionTwo;
		this.optionThree = optionThree;
		this.optionFour = optionFour;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getOptionOne() {
		return optionOne;
	}
	public void setOptionOne(String optionOne) {
		this.optionOne = optionOne;
	}
	public String getOptionTwo() {
		return optionTwo;
	}
	public void setOptionTwo(String optionTwo) {
		this.optionTwo = optionTwo;
	}
	public String getOptionThree() {
		return optionThree;
	}
	public void setOptionThree(String optionThree) {
		this.optionThree = optionThree;
	}
	public String getOptionFour() {
		return optionFour;
	}
	public void setOptionFour(String optionFour) {
		this.optionFour = optionFour;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public void saveQuestion(Question question) {
		// TODO Auto-generated method stub
		
	}

	public static Question findQuestionByquestionId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Question> getAllQuestionsBySubject(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Question findQuestionByquestionId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void deleteQuestionByquestionId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
