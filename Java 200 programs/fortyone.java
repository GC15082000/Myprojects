import java.util.Scanner;

public class fortyone {   
	public static void main(String[] args)
	{ 	 
		
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();						
			if(g>=80)	 			
	 			 System.out.print("A");	 		 
			else if(g<80 && g>=60)	 			
	 			 System.out.print("B");
			else if(g<60 && g>=50)	
	 			 System.out.print("C"); 
			else if(g<50 && g>=45) 
	 			 System.out.print("D");
	 	    else if(g<45 && g>=25)
 			 System.out.print(" E"); 		 
	 	    else if(g<25) 			
 			 System.out.print("F"); 			
 			else
	 		System.out.print("not a correct option");
		} 	
}
