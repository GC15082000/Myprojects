package com.dto;

public class Mobile {
	private int mID;
	private String mName;
	private PhoneNumDetails phoneNumDetails;

	public int getmID() {
		return mID;
	}

	public void setmID(int mID) {
		this.mID = mID;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public PhoneNumDetails getPhoneNumDetails() {
		return phoneNumDetails;
	}

	public void setPhoneNumDetails(PhoneNumDetails phoneNumDetails) {
		this.phoneNumDetails = phoneNumDetails;
	}

	@Override
	public String toString() {
		return "Mobile [mID=" + mID + ", mName=" + mName + ", phoneNumDetails=" + phoneNumDetails + "]";
	}
}
