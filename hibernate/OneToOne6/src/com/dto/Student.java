package com.dto;

public class Student {
	private int sID;
	private String sName;
	private String sClass;
	private Address address;

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sClass=" + sClass + ", address=" + address + "]";
	}
}
