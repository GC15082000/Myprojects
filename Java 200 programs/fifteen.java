import java.util.Scanner;

public class fifteen
 {   
	public static void main(String[] args)
	{ 	 
		
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();	
		int g1=sc.nextInt();	
		int gc=0;
		char ch =sc.next().charAt(0) ;
		switch (ch)
		{
		case '+' :		
	 		
	 			gc=g+g1;
	 			 System.out.print(gc);
	 			break;
		case '-':
	 		 
	 			if(g>g1)
	 			gc=g-g1;
	 			 System.out.print(gc);
	 			break;
		case '*':
	 		
	 			gc=g*g1;
	 			 System.out.print(gc);
	 			break;
		case '/':
	 		 
	 			if(g>g1) {
	 			gc=g/g1;
	 			 System.out.print(gc);
	 			}
	        	break;
	 		
	 	default:
	 		System.out.print("not a correct option");
		} 
	}
}