import java.util.Scanner;

public class onehundredthirteen{   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the sides and length");	
			
			float n=sc.nextInt();			
	    	float l=sc.nextFloat();
	       float  x=(float) Math.pow(l,2);
	       double y=Math.tan(180/n);
	       
	       
	       double  total= (x * n) / (4 *y);
	       
			System.out.print(x+" total distance :"+ total);		
					}			
				