package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order1")
public class Order1 {
	@Id
	@Column(name="orNum")
	private int orNum;
	
	@Column(name="orAdd")
	private String orAdd;
	
	@Column(name="orProductName")
	private String orProductName;

	public int getOrNum() {
		return orNum;
	}

	public void setOrNum(int orNum) {
		this.orNum = orNum;
	}

	public String getOrAdd() {
		return orAdd;
	}

	public void setOrAdd(String orAdd) {
		this.orAdd = orAdd;
	}

	public String getOrProductName() {
		return orProductName;
	}

	public void setOrProductName(String orProductName) {
		this.orProductName = orProductName;
	}

	@Override
	public String toString() {
		return "Order [orNum=" + orNum + ", orAdd=" + orAdd + ", orProductName=" + orProductName + "]";
	}

}
