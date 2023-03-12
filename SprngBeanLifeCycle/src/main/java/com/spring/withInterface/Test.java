package com.spring.withInterface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception {
       
        ConfigurableApplicationContext context1=new ClassPathXmlApplicationContext("com/spring/withInterface/applicationContext.xml");
        Student stu1=(Student)context1.getBean("id"); 
        
        System.out.println(stu1); 
        context1.close();
	}

}
