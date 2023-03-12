package com.onetothirty;

import java.util.Scanner;

public class TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the Number :");
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
		for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<n;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
