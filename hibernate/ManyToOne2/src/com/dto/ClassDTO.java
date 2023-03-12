package com.dto;

import java.util.List;

public class ClassDTO {
	private int classNum;
	private String numOfStudents;

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public String getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(String numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	@Override
	public String toString() {
		return "ClassDTO [classNum=" + classNum + ", numOfStudents=" + numOfStudents + "]";
	}

}
