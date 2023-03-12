package com.practice.OptionalClass;

import java.util.Optional;

public class OptionalClassExample {
 public static Optional<String> getName(){
	 String str=null;
	 return Optional.ofNullable(str);
 }
	public static void main(String[] args) {
		String str="Gaurav";
//		if(str==null)
//			System.out.println("Null");
//		else
//		  System.out.println(str.length());
		
		// To avoid null Pointer Exception or writing if else conditions for null we use Optional Class
		
		Optional<String> op=Optional.ofNullable(str);
		System.out.println(op.get());
		System.out.println(op.isEmpty());
		System.out.println(op.isPresent());
		System.out.println(op.orElse("Null"));
		
		Optional<String> name = getName();
		System.out.println(name.orElse("IS NULL"));
	}

}
