package com.dto;

public class SoldierDetailsDTO {
	private int sId;
	private String sName;
	private String typeOfField;
	private Army army;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getTypeOfField() {
		return typeOfField;
	}

	public void setTypeOfField(String typeOfField) {
		this.typeOfField = typeOfField;
	}

	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}

	@Override
	public String toString() {
		return "SoldierDetailsDTO [sId=" + sId + ", sName=" + sName + ", typeOfField=" + typeOfField + ", army=" + army
				+ "]";
	}
}
