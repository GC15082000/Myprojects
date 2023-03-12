import java.util.Scanner;

public class thirtyeight{   
	public static void main(String[] args)	{ 	    
		Scanner sc= new Scanner(System.in);
		
	int x=sc.nextInt();
	
	int y=sc.nextInt();
	int z=sc.nextInt();
	int g=sc.nextInt();
	int t=sc.nextInt();



		int n=((y>x)?((y>z)?y:z):((z>x)?z:x));	
		int c=((n>g)?((n>t)?y:t):((t>g)?t:g));
		System.out.println(" "+c);
	
	}
	}