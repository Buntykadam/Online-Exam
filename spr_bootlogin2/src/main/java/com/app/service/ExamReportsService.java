package com.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.ExamReports;
import com.app.repo.ExamReportsRepository;

@Service
@Transactional
public class ExamReportsService {
	@Autowired
   ExamReportsRepository er;
	
	public List<ExamReports> prodlist()
	{
		return er.findAll();
	}
	
	public Optional<ExamReports> findById(int report_id){

		return er.findById(report_id);
	}
	
	public ExamReports save(ExamReports examreports){
		return er.save(examreports);
	}
	
	
}