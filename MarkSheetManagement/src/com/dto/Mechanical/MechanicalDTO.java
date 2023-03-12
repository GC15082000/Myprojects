package com.dto.Mechanical;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.Result.ResultDTO;

@Entity
@Table(name = "MechanicalDTO")
public class MechanicalDTO {
	@Id
	@Column(name = "mID")
	private Integer mID;
	@Column(name = "numOfStudents")
	private Integer numOfStudents;
	@Column(name = "depthod")
	private String depthod;
	@OneToOne(targetEntity = ResultDTO.class, cascade = CascadeType.ALL)
	private ResultDTO result;

	public ResultDTO getResult() {
		return result;
	}

	public void setResult(ResultDTO result) {
		this.result = result;
	}

	public Integer getmID() {
		return mID;
	}

	public void setmID(Integer mID) {
		this.mID = mID;
	}

	public Integer getNumOfStudents() {
		return numOfStudents;
	}

	public void setNumOfStudents(Integer numOfStudents) {
		this.numOfStudents = numOfStudents;
	}

	public String getDepthod() {
		return depthod;
	}

	public void setDepthod(String depthod) {
		this.depthod = depthod;
	}
}
