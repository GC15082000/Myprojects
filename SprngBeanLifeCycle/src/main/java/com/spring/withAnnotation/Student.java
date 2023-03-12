package com.spring.withAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
    
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Init or afterpropertyset method");
		
	}
      
	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method");
	}

}
