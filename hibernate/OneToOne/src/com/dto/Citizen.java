package com.dto;

public class Citizen {
	private int citID;
	private String citName;
	private String citCity;
	private VoterID voter;

	public int getCitID() {
		return citID;
	}

	public void setCitID(int citID) {
		this.citID = citID;
	}

	public String getCitName() {
		return citName;
	}

	public void setCitName(String citName) {
		this.citName = citName;
	}

	public String getCitCity() {
		return citCity;
	}

	public void setCitCity(String citCity) {
		this.citCity = citCity;
	}

	public VoterID getVoter() {
		return voter;
	}

	public void setVoter(VoterID voter) {
		this.voter = voter;
	}

	@Override
	public String toString() {
		return "Citizen [citID=" + citID + ", citName=" + citName + ", citCity=" + citCity + ", voter=" + voter + "]";
	}
}
