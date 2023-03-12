import java.util.Scanner;

		public class sixtytwo {   
			public static void main(String[] args)
			{ 	 	
				Scanner sc=new Scanner(System.in);
								
	int l=sc.nextInt();
	int n=sc.nextInt(); int gcd = 0;
			 for(int i=1;i%n==0&& i%l==0;i++)
			 {
		       gcd=i;
			 }
			
			System.out.print(" gcd :"+gcd);	
			}			
		}