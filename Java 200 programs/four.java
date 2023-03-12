import java.util.Scanner;

public class four {
   
	public static void main(String[] args)
	{
		Scanner r =new Scanner(System.in);
		 int fact=1;
	   int n =r.nextInt();
		for(int i=1;i<=n;i++)
		{   
			
			fact=i*fact;
		
		}
		System.out.print(fact);
	}
	
}
