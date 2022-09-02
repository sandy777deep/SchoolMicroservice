package com.example.School.pojo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer" })
@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String studentName;
	@Column(nullable = false)

	private int standered;
	@Basic
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String studentName, int standered, Date dateOfBirth) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.standered = standered;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStandered() {
		return standered;
	}

	public void setStandered(int standered) {
		this.standered = standered;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", standered=" + standered + "]";
	}

}
