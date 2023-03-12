package com.onetothirty;

import java.util.Scanner;

public class Four {
  //Factorial series in programs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Please Enter the number ");
			int num=sc.nextInt();
			int fact=1;
			for(int i=1;i<=num;i++)
			{ 
			fact=fact*i;
			System.out.print(fact+" ");
			}
		}		
	}
}
