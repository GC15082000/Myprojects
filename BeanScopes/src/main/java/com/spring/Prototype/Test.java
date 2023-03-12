package com.spring.Prototype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception {
        ApplicationContext context1=new ClassPathXmlApplicationContext("com/spring/Prototype/applicationContext.xml");
        
        System.out.println("In prototype everytime a new object is created");
        Student stu1=(Student)context1.getBean("id"); 
        System.out.println(stu1.hashCode()); 
        
        Student stu2=(Student)context1.getBean("id");         
        System.out.println(stu2.hashCode());
        
	}

}
