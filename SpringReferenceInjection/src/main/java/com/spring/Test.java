package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Resource resource =new ClassPathResource("com/spring/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		A a=(A)factory.getBean("aref");
		System.out.println(a.getId());
		 System.out.println(a.getB());
	    System.out.println(a.getB().getY());
	    System.out.println(a);
	
	}

}
