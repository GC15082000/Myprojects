package com.dto;

import java.util.Set;

public class ElectronicDeviceDTO {
	private int eId;
	private String eType;

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

	@Override
	public String toString() {
		return "ElectronicDeviceDTO [eId=" + eId + ", eType=" + eType + "]";
	}

}
