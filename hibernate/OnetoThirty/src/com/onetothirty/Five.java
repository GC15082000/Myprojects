package com.onetothirty;

import java.util.Scanner;

public class Five {
    // ower of number 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println(" please Enter the number of n1 and n2 ");
       int n1 =sc.nextInt();
       int n2=sc.nextInt();
       System.out.println(" power of n1 to n2 ="+ Math.pow(n1, n2));
	}

}
