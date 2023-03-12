import java.util.Scanner;

public class fortytwo
{   
	public static void main(String[] args)
	{ 	 
		
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();		
		int g1=sc.nextInt();		
		int g2=sc.nextInt();		
			
		int p=((g>g1)?((g>g2)?g:g2):(g2<g1)?g1:g2);
		     
	 			 System.out.print("oldest:"+p);	 	
	 			 
	 		int g3=((g<g1)?((g<g2)?g:g2):(g2>g1)?g1:g2);
	 		System.out.println(" youngest:"+g3);
		} 	
}