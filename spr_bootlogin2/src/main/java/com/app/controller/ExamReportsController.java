package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.ResourceNotFoundException;
import com.app.model.ExamReports;
import com.app.service.ExamReportsService;
import com.app.service.*;
import com.app.repo.*;
import com.app.service.ExamReportsService;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("/api")
public class ExamReportsController {
	
    @Autowired
	private ExamReportsService el;
    
    @GetMapping("/examreports1")
    public List<ExamReports> prodlist()
    {
    	return el.prodlist();
    }

    @GetMapping("/examreports1/{id}")
    public ResponseEntity<Optional<ExamReports>> getExamReportsById(@PathVariable(value = "id") int report_id)
        throws ResourceNotFoundException {
    	Optional<ExamReports> examreports = el.findById(report_id);
        return ResponseEntity.ok().body(examreports);
    }
    @PostMapping("/examreports1")
    public ExamReports createExamReports(@RequestBody ExamReports examreports) {
        return el.save(examreports);
    }
    
    @PutMapping("/examreports1/{id}")
    public ResponseEntity<ExamReports> updateExamReports(@PathVariable(value = "id") int report_id,@RequestBody ExamReports examreportsDetails) throws ResourceNotFoundException {
    	ExamReports examreports = el.findById(report_id)
        .orElseThrow(() -> new ResourceNotFoundException("examreports not found for this id :: " + report_id));

        
    	examreports.setReport_id(examreportsDetails.getReport_id());
    
    	
        final ExamReports updateExamReports = el.save(examreports);
        return ResponseEntity.ok(updateExamReports);
    }
   
    
}