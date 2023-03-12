import java.util.Scanner;

public class onefifty789 {   
	public static void main(String[] args)
	{ 	 	
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number and base ");					
			int l=sc.nextInt();
			int x=sc.nextInt();
		    int g=getval(l,x); 
		    System.out.print(g);
		    
     
					}			
			

public static int getval(int l,int x)
{   int ten=1;
	int rev=0;
	while(l>0) {
		int dig=l%x;
		
		  l=l/x;
		
		 rev=dig*ten+rev;
		 
		ten= ten*10;
		
		
	}
	
	return rev;
}
}
