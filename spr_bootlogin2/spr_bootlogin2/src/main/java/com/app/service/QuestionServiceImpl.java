package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Exam;
import com.app.model.Question;
import com.app.model.User;
import com.app.repo.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {
	

	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> getAllQuestionsBySubject(Exam ex) {
		return questionRepository.findByex(ex);
	}

	@Override
	public Question saveQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Question findQuestionByid(Long id) {
		return questionRepository.findByid(id);
	}

	@Override
	public void deleteQuestionByid(Long id) {
		questionRepository.deleteByid(id);
		return;
	}

	
	@Override
	public Question save(Question question) {
	return	questionRepository.save(question);
		
	}

	@Override
	public List<Question> queslist() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
