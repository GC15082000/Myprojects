package com.dto;

public class Addhar {
	private int addharNUM;
	private String addharCode;

	public int getAddharNUM() {
		return addharNUM;
	}

	public void setAddharNUM(int addharNUM) {
		this.addharNUM = addharNUM;
	}

	public String getAddharCode() {
		return addharCode;
	}

	public void setAddharCode(String addharCode) {
		this.addharCode = addharCode;
	}

	@Override
	public String toString() {
		return "Addhar [addharNUM=" + addharNUM + ", addharCode=" + addharCode + "]";
	}

}
