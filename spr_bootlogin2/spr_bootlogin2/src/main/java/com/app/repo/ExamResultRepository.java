package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.ExamResult;

public interface ExamResultRepository extends JpaRepository<ExamResult,Integer> {

}
