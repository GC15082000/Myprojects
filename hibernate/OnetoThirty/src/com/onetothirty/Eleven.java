package com.onetothirty;

import java.util.Scanner;

public class Eleven {
	 //table of n
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     System.out.println("please enter the table number :");
			Scanner sc= new Scanner (System.in);
			int t=sc.nextInt();
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println(t+" X "+i+" = "+t*i);
	     }
		}

}
