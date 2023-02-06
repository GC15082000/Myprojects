package com.dto;

public class LaptopDTO {
	private int lId;
	private String lName;
	private int lPrice;

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getlPrice() {
		return lPrice;
	}

	public void setlPrice(int lPrice) {
		this.lPrice = lPrice;
	}

	@Override
	public String toString() {
		return "LaptopDTO [lId=" + lId + ", lName=" + lName + ", lPrice=" + lPrice + "]";
	}

}
