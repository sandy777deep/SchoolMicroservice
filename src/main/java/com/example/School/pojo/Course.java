package com.example.School.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="Course")
public class Course {
	@Id
	@Column(name="Course_id")
	private long id;
	@Column(name="courseName")
	private String courseName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}

	public Course(long id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	public Course() {
		super();
	}
	
	

}
