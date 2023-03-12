package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Resource resource =new ClassPathResource("com/spring/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Employee emp=(Employee)factory.getBean("employee");
		System.out.println("Primitive type ");
		System.out.println(emp.geteNum());
		System.out.println("List");
		System.out.println(emp.geteName());
		System.out.println("Map");
		
	    System.out.println(emp.geteCity());
		System.out.println("Set");
	    System.out.println(emp.getPhNum());
	
	}

}
