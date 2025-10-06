package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	private String courseId;
	private String courseName;
	private int durationInWeeks;
	private String trainer;
	
	

//	public Course(String courseId, String courseName, int durationInWeeks, String trainer) {
//		this.courseId = courseId;
//		this.courseName = courseName;
//		this.durationInWeeks = durationInWeeks;
//		this.trainer = trainer;
//	}
//
//	public Course() {
//	}
//
//	public String getCourseId() {
//		return courseId;
//	}
//
//	public void setCourseId(String courseId) {
//		this.courseId = courseId;
//	}
//
//	public String getCourseName() {
//		return courseName;
//	}
//
//	public void setCourseName(String courseName) {
//		this.courseName = courseName;
//	}
//
//	public int getDurationInWeeks() {
//		return durationInWeeks;
//	}
//
//	public void setDurationInWeeks(int durationInWeeks) {
//		this.durationInWeeks = durationInWeeks;
//	}
//
//	public String getTrainer() {
//		return trainer;
//	}
//
//	public void setTrainer(String trainer) {
//		this.trainer = trainer;
//	}

}