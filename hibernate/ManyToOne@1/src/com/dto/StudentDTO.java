package com.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentDTO")
public class StudentDTO {
	@Id
	@Column(name="sId")
	private int sId;
	@Column(name="sName")
	private String sName;
	@Column(name="sEnrolledIn")
	private String sEnrolledIn;
	@ManyToOne(targetEntity=CouresDTO.class,cascade=CascadeType.ALL)
	private CouresDTO Course;

	public CouresDTO getCourse() {
		return Course;
	}

	public void setCourse(CouresDTO course) {
		Course = course;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEnrolledIn() {
		return sEnrolledIn;
	}

	public void setsEnrolledIn(String sEnrolledIn) {
		this.sEnrolledIn = sEnrolledIn;
	}

	@Override
	public String toString() {
		return "StudentDTO [sId=" + sId + ", sName=" + sName + ", sEnrolledIn=" + sEnrolledIn + ", Course=" + Course
				+ "]";
	}

}
