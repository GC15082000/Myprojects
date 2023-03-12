import java.util.Scanner;

public class thirtyfour {   
	public static void main(String[] args)	{ 	    
		Scanner sc= new Scanner(System.in);
		// x= length;
	int x=sc.nextInt();
	//y breadth;
	int y=sc.nextInt();
		if(y>=0 && x>=0)
		{
			if(x==y) {
				System.out.print("square");
			}
			else {
		System.out.println("rectangle" );
			}
		}
		
		else {
			System.out.println(" false");
		}
	}		
						
		
	}