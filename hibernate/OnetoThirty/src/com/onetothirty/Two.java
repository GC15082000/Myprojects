package com.onetothirty;

import java.util.Scanner;

public class Two {
   //prime number:that are divisible by itself
	// to check whether a number is prime or not 
	public static void  main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num =sc.nextInt();
		 if(num==0 || num==1) {
			 System.out.println(" not a prime number ");
		 }
		 for(int i=2;i<=num;i++)
		 {  
		 if(num%i==0) {
			 System.out.println("yes it is prime number ");
			break; 
		 }
		 if(num%i!=0) {
			 System.out.println("no it not a prime number");
			 break;
		 }		 
		 }
		
	}
	
}	