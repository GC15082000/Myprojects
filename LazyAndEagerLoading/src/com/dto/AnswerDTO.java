package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class AnswerDTO {
	@Id
	@Column(name = "aID")
	private Integer aID;
	@Column(name = "ansname")
	private String aName;
	@ManyToOne
	private QuestionDTO question;

	public QuestionDTO getQuestion() {
		return question;
	}

	public void setQuestion(QuestionDTO question) {
		this.question = question;
	}

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

	@Override
	public String toString() {
		return "AnswerDTO [aID=" + aID + ", aName=" + aName + "Question=" + question + "]";
	}
}
