package com.spring.withAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception {
		// two ways to call destroy method 
		
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/withInterface/applicationContext.xml");
//        Student stu=(Student)context.getBean("id"); 
//      
//        System.out.println(stu);  
//        context.registerShutdownHook(); // this will shutdown the destroy method
        
        ConfigurableApplicationContext context1=new ClassPathXmlApplicationContext("com/spring/withAnnotation/applicationContext.xml");
        Student stu1=(Student)context1.getBean("id"); 
        
        System.out.println(stu1); 
        context1.close();
	}

}
