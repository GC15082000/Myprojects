package com.onetothirty;

import java.util.Scanner;

public class Eight {
    // To Check whether a number is Even or not 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num= sc.nextInt();
	  if(num%2==0)
	  {
		 System.out.println("Even Number"); 
	  }
	  else
	  {
		  System.out.println("Odd Number ");
	  }
	}
}
