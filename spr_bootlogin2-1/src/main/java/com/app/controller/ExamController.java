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
import com.app.model.Exam;
import com.app.service.ExamService;
import com.app.service.*;
import com.app.repo.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("/api")
public class ExamController {
	
    @Autowired
	private ExamService ps;
    
    @GetMapping("/exam")
    public List<Exam> prodlist()
    {
    	return ps.prodlist();
    }

    @GetMapping("/exam/{id}")
    public ResponseEntity<Optional<Exam>> getExamById(@PathVariable(value = "id") int exam_id)
        throws ResourceNotFoundException {
    	Optional<Exam> exam = ps.findById(exam_id);
        return ResponseEntity.ok().body(exam);
    }
    @PostMapping("/exam")
    public Exam createExam(@RequestBody Exam exam) {
        return ps.save(exam);
    }
    
    @PutMapping("/exam/{id}")
    public ResponseEntity<Exam> updateExam(@PathVariable(value = "id") int exam_id,@RequestBody Exam examDetails) throws ResourceNotFoundException {
    	Exam exam = ps.findById(exam_id)
        .orElseThrow(() -> new ResourceNotFoundException("exam not found for this id :: " + exam_id));

        
//    	admin.setId(adminDetails.getId());
    	exam.setExam_name(examDetails.getExam_name());
    
    	
        final Exam updateExam = ps.save(exam);
        return ResponseEntity.ok(updateExam);
    }
   
    
}