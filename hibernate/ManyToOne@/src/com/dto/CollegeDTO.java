package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CollegeDTO")
public class CollegeDTO {
	
	@Id
	@Column(name="cId")
	private int cId;
	
	@Column(name="cName")
	private String cName;
	
	@Column(name="cCity")
	private String cCity;
	
	@Column(name="numOfStudents")
	private int numOfStudents;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public int getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	@Override
	public String toString() {
		return "CollegeDTO [cId=" + cId + ", cName=" + cName + ", cCity=" + cCity + ", numOfStudents=" + numOfStudents
				+ "]";
	}

}
