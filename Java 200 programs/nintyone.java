import java.util.Scanner;

public class nintyone {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter :h and radius  ");							
			float h=sc.nextInt();	
				
	    	float radius=sc.nextInt();			
	    	float pi=(float) 3.14;
	    	
		    float vol=radius*radius*pi*h;
		
			System.out.print(" volume :"+ vol);		
					}			
				}