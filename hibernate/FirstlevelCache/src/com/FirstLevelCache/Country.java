package com.FirstLevelCache;

public class Country {
	private int cID;
	private String cName;

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Country [cID=" + cID + ", cName=" + cName + "]";
	}

}
