simport java.util.Scanner;

public class fiftythree {   
	public static void main(String[] args)
	{ 	 	
		Scanner sc=new Scanner(System.in);
						
		int n=sc.nextInt();
	if(n==0||n==1||n==1/2)
	{
		
			 System.out.print(" not prime");
		 
	}
	 for(int i=2;i<=n;i++) {
		 
		 if(n==i/2||n%i==0) {
			 System.out.print(" not prime");
		 }
		 
		 else {
			 System.out.print(" prime");
		 }
	 }
}
}