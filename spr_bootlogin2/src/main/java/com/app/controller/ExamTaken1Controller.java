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
import com.app.model.ExamTaken1;
import com.app.service.ExamTaken1Service;
import com.app.service.*;
import com.app.repo.*;
import com.app.service.ExamTaken1Service;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("/api")
public class ExamTaken1Controller {
	
    @Autowired
	private ExamTaken1Service el;
    
    @GetMapping("/examtaken1")
    public List<ExamTaken1> prodlist()
    {
    	return el.prodlist();
    }

    @GetMapping("/examtaken1/{id}")
    public ResponseEntity<Optional<ExamTaken1>> getExamTaken1ById(@PathVariable(value = "id") int taken_id)
        throws ResourceNotFoundException {
    	Optional<ExamTaken1> examtaken1 = el.findById(taken_id);
        return ResponseEntity.ok().body(examtaken1);
    }
    @PostMapping("/examtaken1")
    public ExamTaken1 createExamTaken1(@RequestBody ExamTaken1 examtaken1) {
        return el.save(examtaken1);
    }
    
    @PutMapping("/examtaken1/{id}")
    public ResponseEntity<ExamTaken1> updateExamTaken1(@PathVariable(value = "id") int taken_id,@RequestBody ExamTaken1 examtaken1Details) throws ResourceNotFoundException {
    	ExamTaken1 examtaken1 = el.findById(taken_id)
        .orElseThrow(() -> new ResourceNotFoundException("examtaken not found for this id :: " + taken_id));

        
    	examtaken1.setTakenId(examtaken1Details.getTakenId());
    
    	
        final ExamTaken1 updateExamTaken1 = el.save(examtaken1);
        return ResponseEntity.ok(updateExamTaken1);
    }
   
    
}