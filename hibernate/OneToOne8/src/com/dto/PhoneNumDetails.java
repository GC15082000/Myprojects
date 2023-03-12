package com.dto;

public class PhoneNumDetails {
	private int pID;
	private int pNum;
	private String pSIMName;

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getpSIMName() {
		return pSIMName;
	}

	public void setpSIMName(String pSIMName) {
		this.pSIMName = pSIMName;
	}

	@Override
	public String toString() {
		return "PhoneNumDetails [pID=" + pID + ", pNum=" + pNum + ", pSIMName=" + pSIMName + "]";
	}

}
