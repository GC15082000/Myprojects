package com.dto.Result;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ResultDTO")
public class ResultDTO {
	@Id
	@Column(name="rollno")
	private Integer rollno;
	@Column(name="sname")
	private String sname;
	@Column(name="sgender")
	private String sgender;
	@Column(name="smarks")
	private String smarks;
	@Column(name="sdob")
	private Integer sdob;
	@Column(name="sCollegename")
	private String sCollegeName;

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String getSmarks() {
		return smarks;
	}

	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}

	public Integer getSdob() {
		return sdob;
	}

	public void setSdob(Integer sdob) {
		this.sdob = sdob;
	}

	public String getsCollegeName() {
		return sCollegeName;
	}

	public void setsCollegeName(String sCollegeName) {
		this.sCollegeName = sCollegeName;
	}
}
