package com.spring.withXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu=(Student)context.getBean("id"); //id activate
        System.out.println(stu.StudentName());
      
        System.out.println(stu);  
        context.registerShutdownHook(); // this will shutdown the destroy method
                                            
	}

}
