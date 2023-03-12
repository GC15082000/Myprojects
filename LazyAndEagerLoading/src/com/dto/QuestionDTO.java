package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class QuestionDTO {
    @Id
    @Column(name="qID")
	private Integer qID;
    @Column(name="qName")
	private String qName;
    @OneToMany(mappedBy="question",fetch=FetchType.EAGER)
	private List<AnswerDTO> answer;

	public List<AnswerDTO> getAnswer() {
		return answer;
	}

	public void setAnswer(List<AnswerDTO> answer) {
		this.answer = answer;
	}

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

	

	@Override
	public String toString() {
		return "QuestionDTO [qID=" + qID + ", qName=" + qName + ", answer=" + answer + "]";
	}
}
