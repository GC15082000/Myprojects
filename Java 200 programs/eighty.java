import java.util.Scanner;
public class eighty {   
public static void main(String[] args)
{ 	 	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter l1 and l2");							
	int l1=sc.nextInt();
	int l2=sc.nextInt();
	l1=l1+l2;
	l2=l1-l2;
	l1=l1-l2;
	
	System.out.print(" l1 and l2 :"+ l1+" and"+l2);		
			}			
		}