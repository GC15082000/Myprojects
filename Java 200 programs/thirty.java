import java.util.Scanner;

public class thirty {   
	public static void main(String[] args)
	{ 	    
       Scanner sc= new Scanner(System.in);
		double score=sc.nextDouble();
		if(score>=80 && score <=90)
		{
			score+=5;
		System.out.println(" "+score);
		}
		else {
			System.out.println(" "+score);
		}
	}		
						
		
	}