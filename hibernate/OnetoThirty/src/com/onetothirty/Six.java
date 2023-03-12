package com.onetothirty;

import java.util.Scanner;

public class Six {
	//Calculate the total
   public static void main(String... args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please Enter the Number ");
	   int n1=sc.nextInt();
	   int n2=sc.nextInt();
	   int n3=sc.nextInt();
	   int T=n1+n2+n3;
	   System.out.println("Total="+T);
	   float P=(T*100)/300;
	   System.out.println("Percentage="+P);
   }
}
