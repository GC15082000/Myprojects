
		import java.util.Scanner;

		public class fortyseven {   
			public static void main(String[] args)
			{ 	 	
				Scanner sc=new Scanner(System.in);
								
	int n=sc.nextInt();
	int r=sc.nextInt();
	int nfact=1;
	int rfact=1;
			 for(int i=1;i<=n;i++)
				 
			 {
				 nfact=nfact*i;
				 
			 }
           for(int i=1;i<=n-r;i++)
				 
			 {
				 rfact=rfact*i;
				 
			 }
				int npr=nfact/rfact;
				int ncr=npr/rfact;
					 System.out.println("npr"+npr);
			  
					 //int ncr=npr/rfact;
					 System.out.println("ncr"+ncr);
			
			
			}			
		}