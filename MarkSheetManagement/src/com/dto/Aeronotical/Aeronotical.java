package com.dto.Aeronotical;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.Result.ResultDTO;
@Entity
@Table(name="Aeronotical")
public class Aeronotical {
	@Id
	@Column(name="aeroID")
	private Integer aeroID;
	@Column(name="numOfSubjects")
	private String numOfSubjects;
	@Column(name="deptHod")
	private String deptHod;
	@OneToOne(targetEntity=ResultDTO.class,cascade=CascadeType.ALL)
	private ResultDTO result;

	public ResultDTO getResult() {
		return result;
	}

	public void setResult(ResultDTO result) {
		this.result = result;
	}

	public Integer getAeroID() {
		return aeroID;
	}

	public void setAeroID(Integer aeroID) {
		this.aeroID = aeroID;
	}

	public String getNumOfSubjects() {
		return numOfSubjects;
	}

	public void setNumOfSubjects(String numOfSubjects) {
		this.numOfSubjects = numOfSubjects;
	}

	public String getDeptHod() {
		return deptHod;
	}

	public void setDeptHod(String deptHod) {
		this.deptHod = deptHod;
	}

}
