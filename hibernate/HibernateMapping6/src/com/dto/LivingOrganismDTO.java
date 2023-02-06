package com.dto;

import java.util.Set;

public class LivingOrganismDTO {
	private int lId;
	private String lType;
	private Set<DetailsDTO> dt;
	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlType() {
		return lType;
	}

	public void setlType(String lType) {
		this.lType = lType;
	}

	public Set<DetailsDTO> getDt() {
		return dt;
	}

	public void setDt(Set<DetailsDTO> dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "LivingOrganismDTO [lId=" + lId + ", lType=" + lType + ", dt=" + dt + "]";
	}

}
