package com.practice;

class calculate{
	 int add(int a,int b) {
		  return a+b;
	  }
	 
	 int add(float a,int b) {
		  return (int) (a+b);
	  }
	  
	  int add(int a,int b,int c) {
		  return a+b+c;
	  }
}
public class CompileTIme {
  public static void main(String... args) {  
	  calculate c= new calculate();
	  c.add(1, 2);
	  c.add(1, 2, 3);
	  System.out.println(c.add(1, 2)); // we know at compile time only
  }
}
