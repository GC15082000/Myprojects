package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@Entity
@NamedQueries(value = { 
		@NamedQuery(name = "SelectAll", query = "from Student")
		,@NamedQuery(name = "SelectID", query = "from Student where id=1")	
		,@NamedQuery(name="MorethanoneColumn",query="Select sID,sName from Student")
		,@NamedQuery(name="OneColumn",query="Select sID from Student")
		,@NamedQuery(name="AggregateFunction",query="Select avg(sID) from Student")
})
@NamedNativeQueries(value = { 
		@NamedNativeQuery(name = "AggregateFunctions", query = "SELECT AVG(sFees) FROM criteriapractice.student", resultClass=Student.class), 
		@NamedNativeQuery(name = "Select where id=1", query = "SELECT * FROM criteriapractice.student where id=1") ,
		@NamedNativeQuery(name = "SelectALL", query = "SELECT * FROM criteriapractice.student") ,
		@NamedNativeQuery(name = "Select(sID,sName)", query = "SELECT sID,sName FROM criteriapractice.student"), 
		@NamedNativeQuery(name = "OneColumn", query = "SELECT sID FROM criteriapractice.student") 
		})
@Table(name = "Student")
public class Student {
	@Id
	private Integer sID;
	private String sName;
	private String sEmail;
	private double sFees;

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

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public double getsFees() {
		return sFees;
	}

	public void setsFees(double sFees) {
		this.sFees = sFees;
	}

	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sEmail=" + sEmail + ", sFees=" + sFees + "]";
	}

}
