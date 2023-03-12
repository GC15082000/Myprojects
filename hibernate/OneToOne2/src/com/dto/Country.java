package com.dto;

public class Country {
	private int counID;
	private String counName;

	public int getCounID() {
		return counID;
	}

	public void setCounID(int counID) {
		this.counID = counID;
	}

	public String getCounName() {
		return counName;
	}

	public void setCounName(String counName) {
		this.counName = counName;
	}

	@Override
	public String toString() {
		return "Country [counID=" + counID + ", counName=" + counName + "]";
	}

}
