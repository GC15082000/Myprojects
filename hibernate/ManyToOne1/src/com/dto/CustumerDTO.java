package com.dto;

public class CustumerDTO {
	private int cusID;
	private String cusName;
	private String cusAddress;
	private VendorDTO Vendor;

	public VendorDTO getVendor() {
		return Vendor;
	}

	public void setVendor(VendorDTO vendor) {
		Vendor = vendor;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	@Override
	public String toString() {
		return "CustumerDTO [cusID=" + cusID + ", cusName=" + cusName + ", cusAddress=" + cusAddress + ", Vendor="
				+ Vendor + "]";
	}

}
