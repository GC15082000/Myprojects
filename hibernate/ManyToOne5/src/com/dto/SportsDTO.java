package com.dto;

import java.util.List;

public class SportsDTO {
	private int sId;
	private String sName;

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

	@Override
	public String toString() {
		return "SportsDTO [sId=" + sId + ", sName=" + sName + "]";
	}

}
