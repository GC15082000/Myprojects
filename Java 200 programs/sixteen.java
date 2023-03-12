import java.util.Scanner;

public class sixteen {   
	public static void main(String[] args)
	{ 	 
		
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();	
		int g1=sc.nextInt();	
		int gc=0;
		char ch =sc.next().charAt(0) ;
	 		if(ch=='+')
	 		{
	 			gc=g+g1;
	 			 System.out.print(gc);
	 		}
	 		if(ch=='-')
	 		{ 
	 			if(g>g1)
	 			gc=g-g1;
	 			 System.out.print(gc);
	 		}
	 		if(ch=='*')
	 		{
	 			gc=g*g1;
	 			 System.out.print(gc);
	 		}
	 		if(ch=='/')
	 		{  
	 			if(g>g1) {
	 			gc=g/g1;
	 			 System.out.print(gc);
	 			}
	 		}
	  
	}
}