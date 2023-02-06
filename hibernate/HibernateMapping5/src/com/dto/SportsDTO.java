package com.dto;

import java.util.List;

public class SportsDTO {
	private int sId;
	private String sName;
	private List<TypeDTO> tp;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<TypeDTO> getTp() {
		return tp;
	}

	public void setTp(List<TypeDTO> tp) {
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "SportsDTO [sId=" + sId + ", sName=" + sName + ", tp=" + tp + "]";
	}

}
