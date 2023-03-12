package com.onetothirty;

import java.util.Scanner;

public class Fourteen {

		 //Sum of first and second last digit number
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the number ");
	       int num=sc.nextInt();	       
	       int n=count(num)-1;
	       int first=(int) (num/(Math.pow(10,n)));
	       int last=num%10;
	       System.out.println("Sum of first and last digit is "+(first+last));      
		}
	       public static int count(int num) {
	    	   int count = 0; 
	    	   while(num>0) {
			 num=num/10;    	   
				count++;
	       }
	    	   return count;
	       }
	}

