package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private Integer eNum;
	private List<String> eName;
	private Map<String, String> eCity;
	private Set<Integer> phNum;

	public Integer geteNum() {
		return eNum;
	}

	public void seteNum(Integer eNum) {
		this.eNum = eNum;
	}

	public List<String> geteName() {
		return eName;
	}

	public void seteName(List<String> eName) {
		this.eName = eName;
	}

	public Map<String, String> geteCity() {
		return eCity;
	}

	public void seteCity(Map<String, String> eCity) {
		this.eCity = eCity;
	}

	public Set<Integer> getPhNum() {
		return phNum;
	}

	public void setPhNum(Set<Integer> phNum) {
		this.phNum = phNum;
	}

	public Employee(Integer eNum, List<String> eName, Map<String, String> eCity, Set<Integer> phNum) {
		super();
		this.eNum = eNum;
		this.eName = eName;
		this.eCity = eCity;
		this.phNum = phNum;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
