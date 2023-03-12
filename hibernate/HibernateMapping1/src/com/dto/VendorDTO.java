package com.dto;

import java.util.Set;

public class VendorDTO {
	private int venID;
	private String venName;
	private long venPhoneNum;
	private Set<CustumerDTO> cs;

	public int getVenID() {
		return venID;
	}

	public void setVenID(int venID) {
		this.venID = venID;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public long getVenPhoneNum() {
		return venPhoneNum;
	}

	public void setVenPhoneNum(long venPhoneNum) {
		this.venPhoneNum = venPhoneNum;
	}

	public Set<CustumerDTO> getCs() {
		return cs;
	}

	public void setCs(Set<CustumerDTO> cs) {
		this.cs = cs;
	}

	@Override
	public String toString() {
		return "VendorDTO [venID=" + venID + ", venName=" + venName + ", venPhoneNum=" + venPhoneNum + ", cs=" + cs
				+ "]";
	}
}
