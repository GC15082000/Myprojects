package com.dto;

public class Account {
	private int accNum;
	private String accName;

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + "]";
	}

}
