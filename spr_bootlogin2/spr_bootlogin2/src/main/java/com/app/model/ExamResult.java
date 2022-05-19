package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="examresult124")
public class ExamResult {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
        private int result_id;
		int examinee_id;
		int exam_id;
		int score;
		String evaluation;
		public ExamResult(int result_id, int examinee_id, int exam_id, int score, String evaluation) {
			super();
			this.result_id = result_id;
			this.examinee_id = examinee_id;
			this.exam_id = exam_id;
			this.score = score;
			this.evaluation = evaluation;
		}
		public ExamResult() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getResult_id() {
			return result_id;
		}
		public void setResult_id(int result_id) {
			this.result_id = result_id;
		}
		public int getExaminee_id() {
			return examinee_id;
		}
		public void setExaminee_id(int examinee_id) {
			this.examinee_id = examinee_id;
		}
		public int getExam_id() {
			return exam_id;
		}
		public void setExam_id(int exam_id) {
			this.exam_id = exam_id;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getEvaluation() {
			return evaluation;
		}
		public void setEvaluation(String evaluation) {
			this.evaluation = evaluation;
		}

}
