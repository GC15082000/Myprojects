package com.spring.LessTightcoupling;

public class OutPutHelper {
	IoutputGenerator outputGenerator;
	
	public OutPutHelper(){
		outputGenerator = new CsvOutputGenerator();
	}
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
}