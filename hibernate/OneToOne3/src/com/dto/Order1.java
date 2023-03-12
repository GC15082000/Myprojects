package com.dto;

public class Order1 {
	private int orNum;
	private String orAdd;
	private String orProductName;

	public int getOrNum() {
		return orNum;
	}

	public void setOrNum(int orNum) {
		this.orNum = orNum;
	}

	public String getOrAdd() {
		return orAdd;
	}

	public void setOrAdd(String orAdd) {
		this.orAdd = orAdd;
	}

	public String getOrProductName() {
		return orProductName;
	}

	public void setOrProductName(String orProductName) {
		this.orProductName = orProductName;
	}

	@Override
	public String toString() {
		return "Order [orNum=" + orNum + ", orAdd=" + orAdd + ", orProductName=" + orProductName + "]";
	}

}
