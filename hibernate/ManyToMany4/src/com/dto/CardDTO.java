package com.dto;

import java.util.Set;

public class CardDTO {
	private int cID;
	private String cardName;
	private String cPurpose;
	private Set<CitizenDTO> cit;

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getcPurpose() {
		return cPurpose;
	}

	public void setcPurpose(String cPurpose) {
		this.cPurpose = cPurpose;
	}

	public Set<CitizenDTO> getCit() {
		return cit;
	}

	public void setCit(Set<CitizenDTO> cit) {
		this.cit = cit;
	}

	@Override
	public String toString() {
		return "CardDTO [cID=" + cID + ", cardName=" + cardName + ", cPurpose=" + cPurpose + ", cit=" + cit + "]";
	}
}
