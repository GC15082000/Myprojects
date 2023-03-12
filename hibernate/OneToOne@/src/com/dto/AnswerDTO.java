package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answerDTO")
public class AnswerDTO {
	@Id
	@Column(name="aID")
	private Integer aID;
	
	@Column(name="aName")
	private String aName;

	public Integer getaID() {
		return aID;
	}

	public void setaID(Integer aID) {
		this.aID = aID;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}
}
