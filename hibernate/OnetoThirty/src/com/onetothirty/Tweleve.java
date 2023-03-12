package com.onetothirty;

import java.util.Scanner;
 // Reverse the  number
public class Tweleve {
	
public static void main(String...args) 
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	int rev=reverse(num);
	System.out.println(" Reverse of Entered number =" +rev);
 }

public static int reverse(int num) 
{   int n=num;
    int rev2=0;
    int rev1=0;
    int n1=count(num);
    for(int i=1;i<=count(num);i++) {
    n=n%10;   
	rev1=(int) (((n*Math.pow(10,n1)))+rev2);
	 n=num/10;
	 num=n;
	 n1--;
	rev2=rev1;
    }
   return (int) (rev1+num/(Math.pow(10,n1)));   
}
public static  int count(int num) {
	int count=0000;
	while(num>0)
	{
		num=num/10;		
		count++;
	}
	return count-1;
}
}
//5453%10 3  3*1000+0   5453/10  545
//545%10  5  5*100+3*1000 545/10  54
//54%10   4  4*10+5*100+3*1000  54/10 5
//5%10
