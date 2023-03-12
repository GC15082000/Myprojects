import java.util.Scanner;

public class eleven {
   
	public static void main(String[] args)
	{
		Scanner r =new Scanner(System.in);
		int table = r.nextInt();
		for(int i=1;i<=10;i++)
		{   
			int c=table*i;
			
			System.out.println(table + " * "+ i + "="+ c  );
		}
		
	}
	
}