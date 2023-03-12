package com.spring.orm.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentTable")
public class Student {
	@Id
	private Integer sID;
	private String sName;
	private String sCity;

	public Integer getsID() {
		return sID;
	}

	public void setsID(Integer sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public Student(Integer sID, String sName, String sCity) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sCity = sCity;
	}

}
