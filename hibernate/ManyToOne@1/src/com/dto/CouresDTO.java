package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CourseDTO")
public class CouresDTO {
	@Id
	@Column(name="cID")
	private int cId;
	@Column(name="cName")
	private String cName;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "CouresDTO [cId=" + cId + ", cName=" + cName + "]";
	}

}
