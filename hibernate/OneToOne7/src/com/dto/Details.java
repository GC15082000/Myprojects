package com.dto;

public class Details {
	private int snum;
	private String spincode;
	private String sNumOfCities;
	private int sArea;

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public String getSpincode() {
		return spincode;
	}

	public void setSpincode(String spincode) {
		this.spincode = spincode;
	}

	public String getsNumOfCities() {
		return sNumOfCities;
	}

	public void setsNumOfCities(String sNumOfCities) {
		this.sNumOfCities = sNumOfCities;
	}

	public int getsArea() {
		return sArea;
	}

	public void setsArea(int sArea) {
		this.sArea = sArea;
	}

	@Override
	public String toString() {
		return "Details [snum=" + snum + ", spincode=" + spincode + ", sNumOfCities=" + sNumOfCities + ", sArea="
				+ sArea + "]";
	}

}
