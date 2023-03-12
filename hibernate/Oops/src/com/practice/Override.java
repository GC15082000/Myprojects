package com.practice;

class calculate1{
	 int add(int a,int b) {
		  return a+b;
	  }
	 
	}
	  
public class Override {
       
	int add(int a,int b,int c) {
		  return a+b+c;
	  }
	public static void main(String[] args) {
		Override c=new Override();
		 c.add(1 ,2,3);

	}

}
