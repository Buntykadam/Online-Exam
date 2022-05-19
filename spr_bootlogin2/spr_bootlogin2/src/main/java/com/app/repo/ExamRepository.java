package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Integer>{



}







