package com.dto;

import java.util.Set;

public class CitizenDTO {
	private int cVID;
	private String cName;
	private int cAge;
	private Set<CardDTO> card;

	public int getcVID() {
		return cVID;
	}

	public void setcVID(int cVID) {
		this.cVID = cVID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcAge() {
		return cAge;
	}

	public void setcAge(int cAge) {
		this.cAge = cAge;
	}

	public Set<CardDTO> getCard() {
		return card;
	}

	public void setCard(Set<CardDTO> card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "CitizenDTO [cVID=" + cVID + ", cName=" + cName + ", cAge=" + cAge + ", card=" + card + "]";
	}

	
}
