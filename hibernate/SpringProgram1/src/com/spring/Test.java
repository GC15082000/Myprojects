package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu=(Student)context.getBean("id"); //id activate
        System.out.println(stu.StudentName());
        //System.out.println(stu.getCity()); we are not using this as because of security purpose
        System.out.println(stu.StudentCity());  // this go to bean in appcontext xml file then call getCity then
                                              //  print the output
	
	}

}
