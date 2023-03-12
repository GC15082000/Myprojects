import java.util.Scanner;

public class fourteen{   
	public static void main(String[] args)
	{ 	  	  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		int b=n%10;
		int b1=0;
		while(n<0) {
			n=n/10;	
			 System.out.print(n);
		}
		b1=n;
		
		int gc=b1+b;
	 		  			   
	   System.out.print(gc);
	}
}