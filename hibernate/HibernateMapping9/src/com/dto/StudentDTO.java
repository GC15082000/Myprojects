package com.dto;

public class StudentDTO {
	private int sId;
	private String sName;
	private String sEnrolledIn;

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
		return "StudentDTO [sId=" + sId + ", sName=" + sName + ", sEnrolledIn=" + sEnrolledIn + "]";
	}

}
