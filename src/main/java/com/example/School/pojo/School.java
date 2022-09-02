package com.example.School.pojo;

public class School {
	
	private Student student;
	
	private Course course;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public School(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "School [student=" + student + ", course=" + course + "]";
	}
	
	

}
