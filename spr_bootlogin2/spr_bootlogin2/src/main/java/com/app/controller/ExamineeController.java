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
import com.app.model.Examinee;
import com.app.service.*;
import com.app.repo.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("/api")
public class ExamineeController {
	
    @Autowired
	private ExamineeService ps;
    
    @GetMapping("/examinee")
    public List<Examinee> prodlist()
    {
    	return ps.prodlist();
    }

    @GetMapping("/examinee/{id}")
    public ResponseEntity<Optional<Examinee>> getExamineesById(@PathVariable(value = "id") int examinee_id)
        throws ResourceNotFoundException {
    	Optional<Examinee> examinees = ps.findById(examinee_id);
        return ResponseEntity.ok().body(examinees);
    }
    @PostMapping("/examinee")
    public Examinee createExaminees(@RequestBody Examinee examinee) {
        return ps.save(examinee);
    }
    
    @PutMapping("/examinee/{id}")
    public ResponseEntity<Examinee> updateExaminee(@PathVariable(value = "id") int examinee_id,@RequestBody Examinee examineeDetails) throws ResourceNotFoundException {
    	Examinee examinees = ps.findById(examinee_id)
        .orElseThrow(() -> new ResourceNotFoundException("examinees not found for this id :: " + examinee_id));

        
//    	admin.setId(adminDetails.getId());
    	examinees.setExaminee_name(examineeDetails.getExaminee_name());
    
    	
        final Examinee updateExaminees = ps.save(examinees);
        return ResponseEntity.ok(updateExaminees);
    }
   
}