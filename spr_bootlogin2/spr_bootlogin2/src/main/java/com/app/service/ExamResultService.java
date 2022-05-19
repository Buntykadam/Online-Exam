package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.ExamResult;
import com.app.repo.ExamResultRepository;
@Service
@Transactional
public class ExamResultService {
	@Autowired
    ExamResultRepository er;
	
	public List<ExamResult> examresultlist()
	{
		return er.findAll();
	}
	public Optional<ExamResult> findById(int result_id){

		return er.findById(result_id);
	}
	public ExamResult save(ExamResult examresult){
		return er.save(examresult);
	}
	
}
