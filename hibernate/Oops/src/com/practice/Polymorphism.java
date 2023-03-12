package com.practice;

class A {
	int g=10;
	public void run(){
		System.out.println("A");
	}
}
public class Polymorphism extends A { 
  int g=20;
  
  public void run() {
	  System.out.println("B");
  }
  public static void main(String[] args) {
	  A a=new Polymorphism(); //Up // Runtime poly or Dynamic Pol
	  a.run();
	  System.out.println();

	}

}
