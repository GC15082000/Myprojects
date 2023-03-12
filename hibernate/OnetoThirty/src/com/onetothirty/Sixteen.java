package com.onetothirty;

import java.util.Scanner;

public class Sixteen {
   //Calculator
	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter the Character");
	char c=sc.next().charAt(0);
    System.out.print(" please Enter the Number as A and B repectively ");
    int a=sc.nextInt();
    int b=sc.nextInt();
	
    if(char c=="gc")
    {
		System.out.println(a+b);
	}
	if(char='-') {
		System.out.println(a-b);
	if(char='/') {
		System.out.println(a/b);
	}
	if(char='*') {
		System.out.println(a*b);
	}
}
