package com.onetothirty;

import java.util.Scanner;

public class One {
   // Fibonacci series (0,1,1,2,3,5,8.......) 
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int y=0,num=sc.nextInt();
       int n1=0;
       int n2=1;
       int n3=0;
	   System.out.print(n1+" "+n2+" ");
		   
		for(int i=2;i<num;i++)
		{   
		  n3=n1+n2;
		  System.out.print(n3 +" ");
		  n1=n2;
		  n2=n3;
		  
		 }
			
		}
}
