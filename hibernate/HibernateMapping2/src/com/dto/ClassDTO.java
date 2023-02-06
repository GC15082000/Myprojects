package com.dto;

import java.util.List;

public class ClassDTO {
	private int classNum;
	private String numOfStudents;
	private List<StudentDTO> stu;

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

	public List<StudentDTO> getStu() {
		return stu;
	}

	public void setStu(List<StudentDTO> stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "ClassDTO [classNum=" + classNum + ", numOfStudents=" + numOfStudents + ", stu=" + stu + "]";
	}

}
