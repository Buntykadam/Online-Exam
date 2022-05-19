package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Examinee;
import com.app.repo.ExamineeRepository;

@Service
@Transactional
public class ExamineeService {
	
	@Autowired
    ExamineeRepository pr;
	
	public List<Examinee> prodlist()
	{
		return pr.findAll();
	}
	public Optional<Examinee> findById(int examinee_id){

		return pr.findById(examinee_id);
	}
	public Examinee save(Examinee examinees){
		return pr.save(examinees);
	}
}
