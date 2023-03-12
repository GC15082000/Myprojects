package com.onetothirty;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it check whether it is a number or not 
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter");
		String str =sc.next();
		try {
			int gc=Integer.parseInt(str);
			System.out.println("yes it is  a number=" +gc);
		}
		catch(Exception e)
		{
			System.out.println("not a valid number ");
		}
		
	} 

}
