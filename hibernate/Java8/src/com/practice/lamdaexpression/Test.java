package com.practice.lamdaexpression;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         MyIntern myIntern = new MyIntern();
//         myIntern.sayHello();
//		
		
//		MyInternInterface i=new MyInternInterface() {
//
//			@Override
//			public void sayHello() {
//				System.out.println(" Secong Say Hello");				
//			}			
//		};
		
//		MyInternInterface i=() ->{
//			System.out.println("Lamda Expression");
//		};
//		
//		SumInterface s=(int a, int b)-> {
//			return a+b;
//		};
//		System.out.println(s.Sum(1, 2));
		
		LengthOfString l=(str)->str.length();
	    System.out.println("LengthOfString="+l.Lengthstr("Gaurav"));
	}

}
