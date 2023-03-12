package com.dto;

public class MovieTickets {
	private int mtNum;
	private String mName;
	private String mtime;
	private Person person;

	public int getMtNum() {
		return mtNum;
	}

	public void setMtNum(int mtNum) {
		this.mtNum = mtNum;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMtime() {
		return mtime;
	}

	public void setMtime(String mtime) {
		this.mtime = mtime;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "MovieTickets [mtNum=" + mtNum + ", mName=" + mName + ", mtime=" + mtime + ", person=" + person + "]";
	}

}
