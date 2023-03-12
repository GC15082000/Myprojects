package com.dto;

public class CitizenDTO {
	private int cVID;
	private String cName;
	private int cAge;
	private VotingMachineDTO VotingMachine;

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

	public VotingMachineDTO getVotingMachine() {
		return VotingMachine;
	}

	public void setVotingMachine(VotingMachineDTO votingMachine) {
		VotingMachine = votingMachine;
	}

	@Override
	public String toString() {
		return "CitizenDTO [cVID=" + cVID + ", cName=" + cName + ", cAge=" + cAge + ", VotingMachine=" + VotingMachine
				+ "]";
	}
}
