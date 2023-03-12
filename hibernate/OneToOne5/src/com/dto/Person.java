package com.dto;

public class Person {
	private int pID;
	private String pName;
	private String pCity;
	private Addhar addhar;

	public Addhar getAddhar() {
		return addhar;
	}

	public void setAddhar(Addhar addhar) {
		this.addhar = addhar;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCity() {
		return pCity;
	}

	public void setpCity(String pCity) {
		this.pCity = pCity;
	}

	@Override
	public String toString() {
		return "Person [pID=" + pID + ", pName=" + pName + ", pCity=" + pCity + ", addhar=" + addhar + "]";
	}

}
