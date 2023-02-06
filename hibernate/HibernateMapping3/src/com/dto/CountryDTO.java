package com.dto;

import java.util.Set;

public class CountryDTO {
	private int cId;
	private String cName;
	private Set<StateDTO> sta;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Set<StateDTO> getSta() {
		return sta;
	}

	public void setSta(Set<StateDTO> sta) {
		this.sta = sta;
	}

	@Override
	public String toString() {
		return "CountryDTO [cId=" + cId + ", cName=" + cName + ", sta=" + sta + "]";
	}
}
