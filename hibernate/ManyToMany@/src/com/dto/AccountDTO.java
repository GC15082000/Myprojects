package com.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="AccountDTO")
public class AccountDTO {
	@Id
	@Column(name="accID")
	private int accID;
	@Column(name="accHolderName")
	private String accHolderName;
	@Column(name="accType")
	private String accType;
	@ManyToMany(targetEntity=BankDTO.class,cascade=CascadeType.ALL)
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
