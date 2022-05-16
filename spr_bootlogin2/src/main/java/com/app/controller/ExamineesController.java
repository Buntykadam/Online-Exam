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
import com.app.model.Examinees;
import com.app.service.*;
import com.app.repo.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("/api")
public class ExamineesController {
	
    @Autowired
	private ExamineesService ps;
    
    @GetMapping("/examinee")
    public List<Examinees> prodlist()
    {
    	return ps.prodlist();
    }

    @GetMapping("/examinee/{id}")
    public ResponseEntity<Optional<Examinees>> getExamineesById(@PathVariable(value = "id") int examinees_id)
        throws ResourceNotFoundException {
    	Optional<Examinees> examinees = ps.findById(examinees_id);
        return ResponseEntity.ok().body(examinees);
    }
    @PostMapping("/examinee")
    public Examinees createExaminees(@RequestBody Examinees examinees) {
        return ps.save(examinees);
    }
    
    @PutMapping("/examinee/{id}")
    public ResponseEntity<Examinees> updateExaminees(@PathVariable(value = "id") int examinees_id,@RequestBody Examinees examineesDetails) throws ResourceNotFoundException {
    	Examinees examinees = ps.findById(examinees_id)
        .orElseThrow(() -> new ResourceNotFoundException("examinees not found for this id :: " + examinees_id));

        
//    	admin.setId(adminDetails.getId());
    	examinees.setExaminees_name(examineesDetails.getExaminees_name());
    
    	
        final Examinees updateExaminees = ps.save(examinees);
        return ResponseEntity.ok(updateExaminees);
    }
   
}