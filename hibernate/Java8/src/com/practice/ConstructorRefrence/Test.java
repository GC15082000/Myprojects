package com.practice.ConstructorRefrence;

import java.util.List;

public class Test {

	public static void main(String[] args) {
	
//		Provider provider=() ->{
//		return new Student();
//		};
		
//		Provider provider=Student :: new;
//		
//		Student stu=provider.getStudent();
//	    stu.display();
		
		List<Integer> l=List.of(1,2,3,4,5);
		System.out.println(l);
		
		 l.stream().forEach(e ->{
			 System.out.println(e);
		 });
		 
		 l.stream().forEach(System.out::print);
	}

}
