package com.spring.Singleton;
public class Student{
	private String City;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		System.out.println("setter method");
		City = city;
	}

	@Override
	public String toString() {
		return "Student [City=" + City + "]";
	}
    

}
