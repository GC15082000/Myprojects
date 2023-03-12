import java.util.Scanner;

public class fiftyeight {   
	public static void main(String[] args)
	{ 	 	
		Scanner sc=new Scanner(System.in);
						
	
		
		int n=sc.nextInt();
		int i=0;
		
		while(n>0) {
			
		int a,b,c;
		b=n%100;
		int b1=b/10;
	 c=n%10;
	 a=n/100;
	 int g=(a*a*a)+(b1*b1*b1)+(c*c*c);
	 if(g==n) {
	 			 System.out.println("armstrong number" +n);	 					
		}	
	 else {
		 System.out.print("");
	 }n--;
	
}
}
	