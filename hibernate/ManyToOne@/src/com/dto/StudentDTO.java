package com.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	@Column(name="courseName")
	private String courseName;
	@ManyToOne(targetEntity=CollegeDTO.class,cascade=CascadeType.ALL)
	private CollegeDTO college;

	public CollegeDTO getCollege() {
		return college;
	}

	public void setCollege(CollegeDTO college) {
		this.college = college;
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "StudentDTO [sId=" + sId + ", sName=" + sName + ", courseName=" + courseName + ", college=" + college
				+ "]";
	}

}
