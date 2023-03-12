package com.spring.tightcoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {

		IoutputGenerator output = new CsvOutputGenerator();
    	output.generateOutput();
	}

}
