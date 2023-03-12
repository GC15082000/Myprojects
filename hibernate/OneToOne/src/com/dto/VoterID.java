package com.dto;

public class VoterID {
	private int votIDNum;
	private String votName;
	private String votAge;

	public int getVotIDNum() {
		return votIDNum;
	}

	public void setVotIDNum(int votIDNum) {
		this.votIDNum = votIDNum;
	}

	public String getVotName() {
		return votName;
	}

	public void setVotName(String votName) {
		this.votName = votName;
	}

	public String getVotAge() {
		return votAge;
	}

	public void setVotAge(String votAge) {
		this.votAge = votAge;
	}

	@Override
	public String toString() {
		return "VoterID [votIDNum=" + votIDNum + ", votName=" + votName + ", votAge=" + votAge + "]";
	}
}
