package com.onetothirty;

import java.util.Scanner;
public class Thirteen {
    //Sum of three digit number 
	public static void main(String... args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the three digit number ");
	int num=sc.nextInt();
	int ones=num/100;
	int thousand=num%10;
	int tens=(num/10)%10;
	int sum=ones+tens+thousand;
	System.out.println(" Sum of three digit number ="+sum );
  }
} 