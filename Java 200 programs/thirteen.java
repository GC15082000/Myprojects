
import java.util.Scanner;
public class thirteen {   
	public static void main(String[] args)
	{ 	  
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=n%10;
		int a=n/100;
		int b=n/10;
		n=b;
		b=n%10;
		int gc=a+b+c;	 		  			   
	   System.out.print(gc);
	}
}