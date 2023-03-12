package com.spring.Singleton;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args)throws Exception {
        ApplicationContext context1=new ClassPathXmlApplicationContext("com/spring/Singleton/applicationContext.xml");
        Student stu1=(Student)context1.getBean("id"); 
        
        System.out.println("In singleton objects are same");
        System.out.println(stu1.hashCode()); 
        
        Student stu2=(Student)context1.getBean("id"); 
        
        System.out.println(stu2.hashCode()); 
       
	}

}
