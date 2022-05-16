package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.ResourceNotFoundException;
import com.app.model.ExamResult;
import com.app.service.ExamResultService;



@RestController
public class ExamResultController {
	 @Autowired
		ExamResultService er;
	    
	    @GetMapping("/examresult")
	    public List<ExamResult> examresultlist()
	    {
	    	return er.examresultlist();
	    }
	    @GetMapping("/examresult/{id}")
	    public ResponseEntity<Optional<ExamResult>> getExamResultById(@PathVariable(value = "id") int result_id)
	        throws ResourceNotFoundException {
	    	Optional<ExamResult> examresult = er.findById(result_id);
	        return ResponseEntity.ok().body(examresult);
	    }
	    @PostMapping("/examresult")
	    public ExamResult createExamResult(@RequestBody ExamResult examresult) {
	        return er.save(examresult);
	    }
	    @PutMapping("/examresult/{id}")
	    public ResponseEntity<ExamResult> updateExamResult(@PathVariable(value = "id") int result_id,@RequestBody ExamResult examresultDetails) throws ResourceNotFoundException {
	    	ExamResult examresult = er.findById(result_id)
	        .orElseThrow(() -> new ResourceNotFoundException("exam result not found for this id :: " + result_id));

	        
//	    	admin.setId(adminDetails.getId());
	    	examresult.setExaminee_id(examresultDetails.getExaminee_id());
	    
	    	
	        final ExamResult updateExamResult = er.save(examresult);
	        return ResponseEntity.ok(updateExamResult);
	    }
}
