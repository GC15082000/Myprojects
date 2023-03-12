package com.spring.autowire.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Resource resource =new ClassPathResource("com/spring/autowire/Constructor/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
	    Categories c=(Categories) factory.getBean("categories");		
	    c.show();
	
	}

}
