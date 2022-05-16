package com.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.ExamTaken1;
import com.app.repo.ExamTaken1Repository;

@Service
@Transactional
public class ExamTaken1Service {
	@Autowired
   ExamTaken1Repository er;
	
	public List<ExamTaken1> prodlist()
	{
		return er.findAll();
	}
	
	public Optional<ExamTaken1> findById(int taken_id){

		return er.findById(taken_id);
	}
	
	public ExamTaken1 save(ExamTaken1 examtaken1){
		return er.save(examtaken1);
	}
	
	
}