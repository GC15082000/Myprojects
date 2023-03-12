import java.util.Scanner;

public class oneeightyeight
 {   
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
{   
 int l1=l/10;    
	int g=0;
	while(l1>0) {
		int vl=l1%10;    
		l1=l1/10;           
	 
	 g=vl*x+g;   
	x=x*x;
			
	}
	int g1=g+l%10;
	return g1;
}
}