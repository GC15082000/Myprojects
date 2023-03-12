package com.dto.CSE;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.Result.ResultDTO;

@Entity
@Table(name = "CSEDTO")
public class CSEDTO {
	@Id
	@Column(name = "cseID")
	private Integer cseID;
	@Column(name = "numOfSubjects")
	private Integer numOfSubjects;
	@Column(name = "depthod")
	private String depthod;
	@OneToOne(targetEntity = ResultDTO.class, cascade = CascadeType.ALL)
	private ResultDTO result;
	@Column(name = "OS")
	private Integer OS;

	@Column(name = "CN")
	private Integer CN;
	@Column(name = "DBMS")
	private Integer DBMS;
	@Column(name = "TOC")
	private Integer TOC;

	@Override
	public String toString() {
		return "[numOfSubjects=" + numOfSubjects + ", OS=" + OS + ", CN=" + CN + ", DBMS=" + DBMS + ", TOC=" + TOC
				+ "]";
	}

	public ResultDTO getResult() {
		return result;
	}

	public void setResult(ResultDTO result) {
		this.result = result;
	}

	public Integer getCseID() {
		return cseID;
	}

	public void setCseID(Integer cseID) {
		this.cseID = cseID;
	}

	public Integer getNumOfSubjects() {
		return numOfSubjects;
	}

	public void setNumOfSubjects(Integer numOfSubjects) {
		this.numOfSubjects = numOfSubjects;
	}

	public String getDepthod() {
		return depthod;
	}

	public void setDepthod(String depthod) {
		this.depthod = depthod;
	}

	public Integer getOS() {
		return OS;
	}

	public void setOS(Integer oS) {
		OS = oS;
	}

	public Integer getCN() {
		return CN;
	}

	public void setCN(Integer cN) {
		CN = cN;
	}

	public Integer getDBMS() {
		return DBMS;
	}

	public void setDBMS(Integer dBMS) {
		DBMS = dBMS;
	}

	public Integer getTOC() {
		return TOC;
	}

	public void setTOC(Integer tOC) {
		TOC = tOC;
	}

}
