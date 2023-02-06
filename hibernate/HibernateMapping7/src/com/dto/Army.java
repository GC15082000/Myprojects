package com.dto;

import java.util.Set;

public class Army {
	private int aId;
	private String numOfSoldiers;
	private Set<SoldierDetailsDTO> dt;

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

	public Set<SoldierDetailsDTO> getDt() {
		return dt;
	}

	public void setDt(Set<SoldierDetailsDTO> dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "Army [aId=" + aId + ", numOfSoldiers=" + numOfSoldiers + ", dt=" + dt + "]";
	}

}
