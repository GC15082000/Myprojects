package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class substringrecursion {

	public static void main(String[] args) {
	
		System.out.println("HELLO USER WELCOME TO THIS CODE!");
		System.out.println("");
		
		Scanner sc= new Scanner (System.in);
		//String s= sc.next();
		List<String> list = new ArrayList<>();  		
		list.add("red");
		list.add("blue");
		list.add("blue");
		list.add("red");
	     
		System.out.println("List of elements: "+list);  
		System.out.println("\nCount all with frequency:"); 
	
		Set<String> uniqueSet = new HashSet<>(list);  
		for (String i : uniqueSet) {  
		 System.out.println(i + ": " + Collections.frequency(list, i));  
		}  
		System.out.println("Thanks");
		}
   

	}


/*System.out.println("PLEASE ENTER 1 = blue  2= black  3=red");
int count1 = 0;
int count2 = 0;
int count3=0;
Scanner sc=new Scanner(System.in);
 int gc = sc.nextInt();
 String gc1=sc.next();
 if(gc1=="yes")
switch(gc)
{
case 1 : count1++;
break;
case 2 : count2++;
break;
case 3 : count3++;
break;
default: System.out.print("invalid  argument");
break;

}
System.out.print("do you want to add ball" + gc1);
System.out.print(count1 + " "+ count2 +" "+count3);
*/
