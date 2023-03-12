package com.spring.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.beans.Employee;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Resource resource =new ClassPathResource("com/spring/resource/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Employee emp=(Employee)factory.getBean("employee");
		emp.employeeDetails();
	
	}

}
