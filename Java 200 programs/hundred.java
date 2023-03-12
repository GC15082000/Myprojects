import java.util.Scanner;

public class hundred {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter radius and height");	
            float height=sc.nextInt();	 			
			float radius=sc.nextInt();			
	    	float pi=(float) 3.14;
	    	
		    float vol=(radius*radius*pi*height)/3;
			System.out.print(" volume of cone :"+ vol);		
					}			
				}