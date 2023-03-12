package com.spring;

public class Person {
	private int pNum;
	private String pName;

	public Person(int pNum, String pName) {
		this.pNum = pNum;
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pNum=" + pNum + ", pName=" + pName + "]";
	}

}
