import java.util.Scanner;

public class fiftysix {   
	public static void main(String[] args)
	{ 	 	
		Scanner sc=new Scanner(System.in);
						
        int n=sc.nextInt(); 
		float g= (float) Math.sqrt(n);
		int g1=(int) g;
		int l=(int) (g1*g1);
		if(l==n)
		{
	 			 System.out.print(" perfectsquareroot:"+l );	 					
		}	
		else{
			System.out.print(" not a perfect square");
		}
}
}