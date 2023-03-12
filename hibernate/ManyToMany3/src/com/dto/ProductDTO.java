package com.dto;

import java.util.Set;

public class ProductDTO {
	private int pID;
	private String pName;
	private String pManfDate;
	private Set<UserDTO> User;

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

	public String getpManfDate() {
		return pManfDate;
	}

	public void setpManfDate(String pManfDate) {
		this.pManfDate = pManfDate;
	}

	public Set<UserDTO> getUser() {
		return User;
	}

	public void setUser(Set<UserDTO> user) {
		User = user;
	}

	@Override
	public String toString() {
		return "ProductDTO [pID=" + pID + ", pName=" + pName + ", pManfDate=" + pManfDate + "]";
	}
}
