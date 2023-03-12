package com.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QuestionDTO")
public class QuestionDTO {
    @Id
    @Column(name="qID")
	private Integer qID;
    
    @Column(name="qName")
	private String qName;
    
    @OneToOne(targetEntity=AnswerDTO.class,cascade=CascadeType.ALL)
	private AnswerDTO answer;

	public Integer getqID() {
		return qID;
	}

	public void setqID(Integer qID) {
		this.qID = qID;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public AnswerDTO getAnswer() {
		return answer;
	}

	public void setAnswer(AnswerDTO answer) {
		this.answer = answer;
	}
}
