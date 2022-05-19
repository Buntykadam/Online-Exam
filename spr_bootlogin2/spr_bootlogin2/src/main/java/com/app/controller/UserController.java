package com.app.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.ResourceNotFoundException;
import com.app.model.User;
import com.app.repo.UserRepository;
import com.app.service.UserService;

@RestController
@RequestMapping("A")
public class UserController {

	 @Autowired
	    private UserService candidateService;

	    @GetMapping("/candidate")
	    public List<User> getAllCandidates() {
	        return candidateService.findAll();
	    }

	    @GetMapping("/candidates/{id}")
	    public ResponseEntity<User> getCandidateById(@PathVariable(value = "id") Long candidateId)
	        throws ResourceNotFoundException {
	    	User candidate = candidateService.findById(candidateId)
	          .orElseThrow(() -> new ResourceNotFoundException("candidate not found for this id :: " + candidateId));
	        return ResponseEntity.ok().body(candidate);
	    }
	    
	    @PostMapping("/candidates")
	    public User createCandidate(@RequestBody User candidate) {
	        return candidateService.save(candidate);
	    }

	    @PutMapping("/candidates/{id}")
	    public ResponseEntity<User> updateCandidate(@PathVariable(value = "id") Long candidateId,
	         @RequestBody User candidateDetails) throws ResourceNotFoundException {
	    	User candidate = candidateService.findById(candidateId)
	        .orElseThrow(() -> new ResourceNotFoundException("candidate not found for this id :: " +candidateId));
	        
	    	candidate.setId(candidateDetails.getId());
	    	candidate.setFname(candidateDetails.getFname());
	    	candidate.setLname(candidateDetails.getLname());
	    	candidate.setEmail(candidateDetails.getEmail());
	    	candidate.setPassword(candidateDetails.getPassword());
	    	candidate.setState(candidateDetails.getState());
	    	candidate.setCity(candidateDetails.getCity());
	    	candidate.setMobile(candidateDetails.getMobile());
	    	candidate.setDob(candidateDetails.getDob());
	   
	    	candidate.setHighestQualification(candidateDetails.getHighestQualification());
	    
	        final User updateCandidate = candidateService.save(candidate);
	        return ResponseEntity.ok(updateCandidate);
	    }

	    @DeleteMapping("/candidates/{id}")
	    public Map<String, Boolean> deleteCandidate(@PathVariable(value = "id") Long candidateId)
	         throws ResourceNotFoundException {
	    	User candidate = candidateService.findById(candidateId)
	       .orElseThrow(() -> new ResourceNotFoundException("candidate not found for this id :: " + candidateId));

	    	candidateService.delete(candidate);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	
}

