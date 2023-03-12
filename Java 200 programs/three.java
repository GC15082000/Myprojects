import java.util.Scanner;

public class three {
   
	public static void main(String[] args)
	{
		Scanner r =new Scanner(System.in);
	  
        
		char g1=r.next().charAt(0);
		
		
		int n1=g1;
			  
   if(n1>=48 && n1<=57)
    {
	   System.out.print(" it is a number");
    }
   else
   {
	   System.out.print("not a number");
   }
		
	
	}
}