package com.onetothirty;

import java.util.Scanner;

public class TwentyOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println(" Please enter any number ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
