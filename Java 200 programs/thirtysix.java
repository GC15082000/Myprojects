import java.util.Scanner;

public class thirtysix {   
	public static void main(String[] args)	{ 	    
		Scanner sc= new Scanner(System.in);
		
	int x=sc.nextInt();
	
	int y=sc.nextInt();
	int z=sc.nextInt();

		int n=((y>x)?((y>z)?y:z):((z>x)?z:x));
		
			
		System.out.println(" "+n);						
	}
	}
	//