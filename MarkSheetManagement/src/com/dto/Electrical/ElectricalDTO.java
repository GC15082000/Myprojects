package com.dto.Electrical;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.Result.ResultDTO;

@Entity
@Table(name="ElectricalDTO")
public class ElectricalDTO {
	@Id
	@Column(name="eID")
	private Integer eID;
	@Column(name="dptHod")
	private String dptHod;
	@Column(name="numOfStudents")
	private Integer NumOfSTudents;
	@OneToOne(targetEntity=ResultDTO.class,cascade=CascadeType.ALL)
	private ResultDTO result;

	public ResultDTO getResult() {
		return result;
	}

	public void setResult(ResultDTO result) {
		this.result = result;
	}

	public Integer geteID() {
		return eID;
	}

	public void seteID(Integer eID) {
		this.eID = eID;
	}

	public String getDptHod() {
		return dptHod;
	}

	public void setDptHod(String dptHod) {
		this.dptHod = dptHod;
	}

	public Integer getNumOfSTudents() {
		return NumOfSTudents;
	}

	public void setNumOfSTudents(Integer numOfSTudents) {
		NumOfSTudents = numOfSTudents;
	}

}
