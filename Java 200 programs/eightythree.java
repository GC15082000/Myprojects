import java.util.Scanner;

public class eightythree {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter :n, P,t,r  ");							
			float n=sc.nextInt();	
			float P=sc.nextInt();	
			float t=sc.nextInt();	
			float r=sc.nextInt();	
	    	float x=r/n;
	    	float y=t*n;
	        double z= Math.pow(x,y);
		    double CI=P*z;
			System.out.print(" CI :"+ CI);				
					}			
					
					
					
					
					
				}