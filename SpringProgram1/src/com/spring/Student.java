package com.spring;

public class Student {
	private String City;
    public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String StudentName() {
    	return ("Gaurav");
    }
	
	public String StudentCity() {
    	return "City"+City;
    }
}
