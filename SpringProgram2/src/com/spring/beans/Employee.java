package com.spring.beans;

public class Employee {
	private Integer eID;
	private String eName;
	private String eCity;

	public Integer geteID() {
		return eID;
	}

	public void seteID(Integer eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	
	public void employeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("E ID:"+eID);
		System.out.println("E Name:"+eName);
		System.out.println("E City:"+eCity);
	}
}
