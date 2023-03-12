package com.dto;

public class AnswerDTO {
	private Integer aID;
	private String aName;

	public Integer getaID() {
		return aID;
	}

	public void setaID(Integer aID) {
		this.aID = aID;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "AnswerDTO [aID=" + aID + ", aName=" + aName + "]";
	}
}
