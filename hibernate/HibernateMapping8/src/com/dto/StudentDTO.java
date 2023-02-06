package com.dto;

public class StudentDTO {
	private int sId;
	private String sName;
	private String courseName;

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
		return "StudentDTO [sId=" + sId + ", sName=" + sName + ", courseName=" + courseName + "]";
	}

}
