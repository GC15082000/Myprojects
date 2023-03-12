package com.spring.loosecoupling;

public class OutPutHelper {
	IoutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
	
	public void setOutputGenerator(IoutputGenerator outputGenerator){
		System.out.println("setter");
		this.outputGenerator = outputGenerator;
	}
}