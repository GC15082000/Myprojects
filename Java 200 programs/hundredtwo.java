import java.util.Scanner;

public class hundredtwo {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter radius");	
             			
			float radius=sc.nextInt();			
	    	float pi=((float)3.14);
	    	
		    float vol=(radius*radius*radius*pi*4)/3;
			System.out.print(" volume of sphere :"+ vol);		
					}			
				}


