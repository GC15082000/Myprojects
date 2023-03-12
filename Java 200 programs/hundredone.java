import java.util.Scanner;

public class hundredone {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter  height :H,base :b,length:l");	
            float height=sc.nextInt();	 			
					
	    	int b=0;
			int l=0;
			float area=(b*l)/2;
	    	
		    float vol=height*area;
			System.out.print(" volume of prism :"+ vol);		
					}			
				}