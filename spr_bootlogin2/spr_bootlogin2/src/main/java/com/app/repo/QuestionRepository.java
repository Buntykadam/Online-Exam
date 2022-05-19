package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Exam;
import com.app.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	List<Question> findByex(Exam ex);

	Question findByid(Long id);

	void deleteByid(Long id);


}
