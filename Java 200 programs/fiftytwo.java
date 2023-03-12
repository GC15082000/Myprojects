import java.util.Scanner;

public class fiftytwo {   
	public static void main(String[] args)
	{ 	 	
		Scanner sc=new Scanner(System.in);
						
		int n=sc.nextInt();
		
		int a,b,c;
		b=n%100;
		int b1=b/10;
	 c=n%10;
	 a=n/100;
	 int g=(a*a*a)+(b1*b1*b1)+(c*c*c);
	 if(g==n) {
	 			 System.out.print("armstrong number" );	 					
		}	
	 else {
		 System.out.print(" not equal");
	 }
}
}