package com.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Exam;
import com.app.repo.ExamRepository;

@Service
@Transactional
public class ExamService {
	@Autowired
   ExamRepository pr;
	
	public List<Exam> prodlist()
	{
		return pr.findAll();
	}
	
	public Optional<Exam> findById(int exam_id){

		return pr.findById(exam_id);
	}
	
	public Exam save(Exam exam){
		return pr.save(exam);
	}
	
	
}