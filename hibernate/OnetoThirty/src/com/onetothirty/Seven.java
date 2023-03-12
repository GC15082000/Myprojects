package com.onetothirty;

import java.util.Scanner;

public class Seven {
  public static void main(String...args) {
	  
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Please Enter the Number");
	  int num=sc.nextInt();
	  if(num<0)
	  {
		  System.out.println("Non-positive number ");
	  }
	  else
	  {
		  System.out.println(" positive number");
	  }
  }
}
