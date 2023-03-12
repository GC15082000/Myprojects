package com.dto;

import java.util.Set;

public class PharmaCompanyDTO {
	private int comID;
	private String pharmaComName;
	private String comCity;
	private Set<MedicineDTO> medicine;

	public int getComID() {
		return comID;
	}

	public void setComID(int comID) {
		this.comID = comID;
	}

	public String getPharmaComName() {
		return pharmaComName;
	}

	public void setPharmaComName(String pharmaComName) {
		this.pharmaComName = pharmaComName;
	}

	public String getComCity() {
		return comCity;
	}

	public void setComCity(String comCity) {
		this.comCity = comCity;
	}

	public Set<MedicineDTO> getMedicine() {
		return medicine;
	}

	public void setMedicine(Set<MedicineDTO> medicine) {
		this.medicine = medicine;
	}

	@Override
	public String toString() {
		return "PharmaCompanyDTO [comID=" + comID + ", pharmaComName=" + pharmaComName + ", comCity=" + comCity
				+ "]";
	}

}
