package com.dto;

import java.util.Set;

public class Army {
	private int aId;
	private String numOfSoldiers;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getNumOfSoldiers() {
		return numOfSoldiers;
	}

	public void setNumOfSoldiers(String numOfSoldiers) {
		this.numOfSoldiers = numOfSoldiers;
	}

	@Override
	public String toString() {
		return "Army [aId=" + aId + ", numOfSoldiers=" + numOfSoldiers + "]";
	}

}
