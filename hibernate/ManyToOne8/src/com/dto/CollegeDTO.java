package com.dto;

import java.util.Set;

public class CollegeDTO {
	private int cId;
	private String cName;
	private String cCity;
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
