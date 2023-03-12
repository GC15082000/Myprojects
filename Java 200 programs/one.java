import java.util.Scanner;

public class one
 {
   
	public static void main(String[] args)
	{
		Scanner r =new Scanner(System.in);
	  int n =r.nextInt();
	 int g2=1;
	 int g1=0;
	
	 System.out.print(g1+" "+g2+" ");
	 for(int i=2;i<=n;i++)
	{  
		 int g = 0;
	     if(g<=n)
	     {
		 g=g2+g1;
		 g2=g1;
		 g1=g;
		
		 System.out.print(g+" ");		
	
	  }
	}
		
	
	}
}
