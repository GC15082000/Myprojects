package com.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="BankDTO")
public class BankDTO {
	@Id
	@Column(name="bankID")
	private int bankID;
	@Column(name="bankName")
	private String bankName;
	@Column(name="bankIFSCCode")
	private String bankIFSCCode;
	@ManyToMany(targetEntity=AccountDTO.class,cascade=CascadeType.ALL)
	private Set<AccountDTO> account;

	public int getBankID() {
		return bankID;
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIFSCCode() {
		return bankIFSCCode;
	}

	public void setBankIFSCCode(String bankIFSCCode) {
		this.bankIFSCCode = bankIFSCCode;
	}

	public Set<AccountDTO> getAccount() {
		return account;
	}

	public void setAccount(Set<AccountDTO> account) {
		this.account = account;
	}

}
