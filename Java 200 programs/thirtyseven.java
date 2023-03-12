import java.util.Scanner;

public class thirtyseven{   
	public static void main(String[] args)	{ 	    
		Scanner sc= new Scanner(System.in);
		
	int x=sc.nextInt();
	
	int y=sc.nextInt();
	int z=sc.nextInt();
	int g=sc.nextInt();


		int n=((y>x)?((y>z)?y:z):((z>x)?z:x));				
		if(n<g)		{
			System.out.println(" "+g);		
		}
	    else if(g>n)  {
			System.out.println(" "+n);	
		}
		
		else
		{
			System.out.print("invalid value");		}
	}
	}