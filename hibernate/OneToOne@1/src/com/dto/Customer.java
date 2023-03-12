package com.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name = "cusID")
	private int cusID;

	@Column(name = "cusName")
	private String cusName;

	@OneToOne(targetEntity = Order1.class, cascade = CascadeType.ALL)
	private Order1 order1;

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public Order1 getOrder1() {
		return order1;
	}

	public void setOrder1(Order1 order1) {
		this.order1 = order1;
	}

	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", cusName=" + cusName + ", order1=" + order1 + "]";
	}
}
