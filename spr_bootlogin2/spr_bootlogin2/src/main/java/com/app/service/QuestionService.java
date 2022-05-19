package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.Exam;
import com.app.model.Question;
import com.app.model.User;

public interface QuestionService {
	List<Question> getAllQuestionsBySubject(Exam ex);
	Question saveQuestion(Question question);
	Question findQuestionByid(Long id);
	void deleteQuestionByid(Long id);
	Question save(Question question);
	List<Question> queslist();
	
	
}
