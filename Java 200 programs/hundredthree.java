import java.util.Scanner;

public class hundredthree {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter radius and height");	
			
			float radius=sc.nextInt();			
	    	float pi=((float)3.14);
	    	float height=sc.nextInt();		
		    float surfacearea=2*radius*pi*(radius+height);
			System.out.print(" surface area of cyclinder :"+ surfacearea);		
					}			
				}