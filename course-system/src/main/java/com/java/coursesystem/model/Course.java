package com.java.coursesystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column
	private String coursename;
	@Column
	private String teacherTakingCourse;
	
	
	public Course() {
	
	}
	
	public Course(Long id, String coursename, String teacherTakingCourse) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.teacherTakingCourse = teacherTakingCourse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTeacherTakingCourse() {
		return teacherTakingCourse;
	}
	public void setTeacherTakingCourse(String teacherTakingCourse) {
		this.teacherTakingCourse = teacherTakingCourse;
	}
	
}
