package com.dto;

public class MedicineDTO {
	private int medID;
	private String medName;
	private String dateManf;
	private PharmaCompanyDTO pharmaCompany;

	public int getMedID() {
		return medID;
	}

	public void setMedID(int medID) {
		this.medID = medID;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getDateManf() {
		return dateManf;
	}

	public void setDateManf(String dateManf) {
		this.dateManf = dateManf;
	}

	public PharmaCompanyDTO getPharmaCompany() {
		return pharmaCompany;
	}

	public void setPharmaCompany(PharmaCompanyDTO pharmaCompany) {
		this.pharmaCompany = pharmaCompany;
	}

	@Override
	public String toString() {
		return "MedicineDTO [medID=" + medID + ", medName=" + medName + ", dateManf=" + dateManf + ", pharmaCompany="
				+ pharmaCompany + "]";
	}

}
