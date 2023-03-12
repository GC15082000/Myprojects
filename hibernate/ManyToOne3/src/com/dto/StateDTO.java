package com.dto;

public class StateDTO {
	private int sId;
	private String sName;
	private int sPopulation;
	private CountryDTO Country;

	public CountryDTO getCountry() {
		return Country;
	}

	public void setCountry(CountryDTO country) {
		Country = country;
	}

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

	public int getsPopulation() {
		return sPopulation;
	}

	public void setsPopulation(int sPopulation) {
		this.sPopulation = sPopulation;
	}

	@Override
	public String toString() {
		return "StateDTO [sId=" + sId + ", sName=" + sName + ", sPopulation=" + sPopulation + ", Country=" + Country
				+ "]";
	}

}
