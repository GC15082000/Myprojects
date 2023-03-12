import java.util.Scanner;

public class fortythree
 {   
	public static void main(String[] args)
	{ 	 
		
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();		
		int g1=sc.nextInt();		
		
       int attendence = (g*100)/(g1);
	   
	   
	   
	   
		if(attendence>=75) {
		     
	 			 System.out.print(" yes ,can sit in class "+attendence);	 
		}
		if(attendence<75)
		{
			 System.out.print(" no ,can't sit in class"+attendence);	 	 		
		}
		} 	
}