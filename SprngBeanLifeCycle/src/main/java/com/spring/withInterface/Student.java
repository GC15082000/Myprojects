package com.spring.withInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
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

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
    public void init() throws Exception {
		System.out.println(" init");
		
	}
}
