package com.dto;

import java.util.Set;

public class MovieTheatreDTO {
	private int mNum;
	private String mtName;
	private int mtPhNum;
	private Set<PersonDTO> person;

	public int getmNum() {
		return mNum;
	}

	public void setmNum(int mNum) {
		this.mNum = mNum;
	}

	public String getMtName() {
		return mtName;
	}

	public void setMtName(String mtName) {
		this.mtName = mtName;
	}

	public int getMtPhNum() {
		return mtPhNum;
	}

	public void setMtPhNum(int mtPhNum) {
		this.mtPhNum = mtPhNum;
	}

	public Set<PersonDTO> getPerson() {
		return person;
	}

	public void setPerson(Set<PersonDTO> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "MovieTheatreDTO [mNum=" + mNum + ", mtName=" + mtName + ", mtPhNum=" + mtPhNum + ", person=" + person
				+ "]";
	}

}
