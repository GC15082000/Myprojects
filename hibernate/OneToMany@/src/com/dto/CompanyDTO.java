package com.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="CompanyDTO1")
public class CompanyDTO {
	@Id
	@Column(name="cId")
	private int cId;
	@Column(name="cName")
	private String cName;
	@OneToMany(targetEntity=EmployeeDTO.class,cascade=CascadeType.ALL)
	//@JoinTable(name="table" ,joinColumns=@JoinColumn(name="emp_gc"),inverseJoinColumns=@joinColumn(name="cgc"))
	@JoinColumn(name="companyId",referencedColumnName="cId") // if we dont write join column then Three tables is created
	
	private List<EmployeeDTO> emp;

	public int getcId() {
		return cId;''
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
