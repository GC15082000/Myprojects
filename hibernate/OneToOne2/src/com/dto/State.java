package com.dto;

public class State {
	private int stNum;
	private String stName;
	private String stArea;
	private Country country;

	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStArea() {
		return stArea;
	}
	public void setStArea(String stArea) {
		this.stArea = stArea;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "State [stNum=" + stNum + ", stName=" + stName + ", stArea=" + stArea + ", country=" + country + "]";
	}
	
}
