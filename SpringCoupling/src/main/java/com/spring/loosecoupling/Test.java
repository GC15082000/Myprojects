package com.spring.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "com/spring/loosecoupling/applicationContext.xml" });

		OutPutHelper output = (OutPutHelper) context.getBean("OutputHelper");
		output.generateOutput();

	}

}
