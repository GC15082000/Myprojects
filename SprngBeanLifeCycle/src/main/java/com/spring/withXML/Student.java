package com.spring.withXML;

public class Student {
	private String City;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		System.out.println("setter method");
		City = city;
	}

	public String StudentName() {
		return ("Gaurav");
	}

	@Override
	public String toString() {
		return "Student [City=" + City + "]";
	}

	public void init() {
		System.out.println("init method");
	}

	public void destroy() {
		System.out.println("destroy method");
	}
}
