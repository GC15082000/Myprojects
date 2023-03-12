import java.util.Scanner;

public class two2 {
   
	public static void main(String[] args)
	{
		Scanner r =new Scanner(System.in);
	  int n =r.nextInt();
	  if(n==0||n==1/2||n==1)
		{
			System.out.print("not prime");
		}
	  
	 	
	 for(int i=2;i<=n;i++)
	{    
		
	    for(int j=2;j<=n;j++)
	    		{ 
	    		   if(i%j==0)
	    		   {
		            System.out.print(" ");
	    		   }
//	    		//   if(i%j==1)
//	    		   {
//		            System.out.print(" prime "+i);
//	    		   }
	    		
	     }
	    if(n==i/2)
		{
			System.out.print("not prime ");
		}else {
	    	 System.out.print(i + " ");
	     }
	     
	}
		
	
	}
}