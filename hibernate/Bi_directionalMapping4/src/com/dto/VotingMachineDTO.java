package com.dto;

import java.util.Set;

public class VotingMachineDTO {
	private int vMacNum;
	private String vMacName;
	private Set<CitizenDTO> citizen;

	public int getvMacNum() {
		return vMacNum;
	}

	public void setvMacNum(int vMacNum) {
		this.vMacNum = vMacNum;
	}

	public String getvMacName() {
		return vMacName;
	}

	public void setvMacName(String vMacName) {
		this.vMacName = vMacName;
	}

	public Set<CitizenDTO> getCitizen() {
		return citizen;
	}

	public void setCitizen(Set<CitizenDTO> citizen) {
		this.citizen = citizen;
	}

	@Override
	public String toString() {
		return "VotingMachineDTO [vMacNum=" + vMacNum + ", vMacName=" + vMacName + ", citizen=" + citizen + "]";
	}
}
