package com.dto;

import java.util.Set;

public class ElectronicDeviceDTO {
	private int eId;
	private String eType;
	private Set<LaptopDTO> lp;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteType() {
		return eType;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}

	public Set<LaptopDTO> getLp() {
		return lp;
	}

	public void setLp(Set<LaptopDTO> lp) {
		this.lp = lp;
	}

	@Override
	public String toString() {
		return "ElectronicDeviceDTO [eId=" + eId + ", eType=" + eType + ", lp=" + lp + "]";
	}

}
