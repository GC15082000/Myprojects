package com.dto;

import java.util.List;

public class CompanyDTO {
	private int cId;
	private String cName;
	private List<EmployeeDTO> emp;

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

	public List<EmployeeDTO> getEmp() {
		return emp;
	}

	public void setEmp(List<EmployeeDTO> emp) {
		this.emp = emp;
	}

}
