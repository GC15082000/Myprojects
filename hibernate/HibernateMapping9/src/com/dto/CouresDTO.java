package com.dto;

import java.util.Set;

public class CouresDTO {
	private int cId;
	private String cName;
	private Set<StudentDTO> st;

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

	public Set<StudentDTO> getSt() {
		return st;
	}

	public void setSt(Set<StudentDTO> st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "CouresDTO [cId=" + cId + ", cName=" + cName + ", st=" + st + "]";
	}

}
