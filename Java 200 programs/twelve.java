import java.util.Scanner;

public class twelve {
   
	public static void main(String[] args)
	{ int remainder;
	  int reverse=0;
	  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	for( n=n;n!=0;n=n/10)
	{		
	    remainder=n%10; 
		 reverse=  remainder+reverse*10;		
	}
	 		  			   
	   System.out.print(reverse);
	}
}