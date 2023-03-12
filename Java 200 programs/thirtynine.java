import java.util.Scanner;

public class thirtynine
 {   
	public static void main(String[] args)	{ 	    
		Scanner sc= new Scanner(System.in);		
	int qunatity=sc.nextInt();

       	int cost=0;
       	
	cost= 100*qunatity;// 1unit =100;
	if(cost>=1000) {
			int discount=(cost*10)/100;
			int total=cost-discount;
			System.out.println(" discount "+discount+" total: "+total);			
		}
	else {
		System.out.println("cost: "+cost);
	
	}
	}
}