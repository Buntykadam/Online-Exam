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
import com.app.model.Question;
import com.app.service.QuestionService;
import com.app.service.*;
import com.app.repo.*;
import com.app.service.QuestionService;


@RestController
@CrossOrigin(origins = "http://localhost:4200" )
@RequestMapping("/api")
public class QuestionController {
	
    @Autowired
	private QuestionService el;
    
    @GetMapping("/examtaken1")
    public List<Question> queslist()
    {
    	return el.queslist();
    }

    @GetMapping("/question/{id}")
    public ResponseEntity<Optional<Question>> getQuestionById(@PathVariable(value = "id") Long questionId)
        throws ResourceNotFoundException {
    	Optional<Question> question = Optional.of(el.findQuestionByid(questionId));
        return ResponseEntity.ok().body(question);
    }
    @PostMapping("/quesexam")
    public ResponseEntity<Optional<List<Question>>> getQuestionById(@RequestBody Exam sbjname)
        throws ResourceNotFoundException {
    	Optional<List<Question>> question = Optional.of(el.getAllQuestionsBySubject(sbjname));
        return ResponseEntity.ok().body(question);
    }
    @PostMapping("/question")
    public Question createQuestion(@RequestBody Question question) {
        return el.save(question);
    }
    
  
    
}