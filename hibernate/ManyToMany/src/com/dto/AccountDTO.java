package com.dto;

import java.util.Set;

public class AccountDTO {
	private int accID;
	private String accHolderName;
	private String accType;
	private Set<BankDTO> bank;

	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Set<BankDTO> getBank() {
		return bank;
	}

	public void setBank(Set<BankDTO> bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "AccountDTO [accID=" + accID + ", accHolderName=" + accHolderName + ", accType=" + accType + ", bank="
				+ bank + "]";
	}

	

}
