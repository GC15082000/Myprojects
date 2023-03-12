package com.dto;

public class QuestionDTO {

	private Integer qID;
	private String qName;
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

	@Override
	public String toString() {
		return "QuestionDTO [qID=" + qID + ", qName=" + qName + ", answer=" + answer + "]";
	}
}
