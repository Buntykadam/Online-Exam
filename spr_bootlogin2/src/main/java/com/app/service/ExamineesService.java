package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Examinees;
import com.app.repo.ExamineesRepository;

@Service
@Transactional
public class ExamineesService {
	
	@Autowired
    ExamineesRepository pr;
	
	public List<Examinees> prodlist()
	{
		return pr.findAll();
	}
	public Optional<Examinees> findById(int examinees_id){

		return pr.findById(examinees_id);
	}
	public Examinees save(Examinees examinees){
		return pr.save(examinees);
	}
}
