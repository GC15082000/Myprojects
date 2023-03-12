import java.util.Scanner;

public class fourtyfour {   
	public static void main(String[] args)
	{ 	 	
		Scanner sc=new Scanner(System.in);
						
		int age=sc.nextInt();
		char sex=sc.next().charAt(0);
		if(sex=='f') {
			System.out.print("urban areas");
		}
		if (age>=40 && age<=60)
		{
	 			 System.out.print(" urban areas");	 
		}
		if(sex=='m'&& age>=20 && age<=40) {
			System.out.print("anywhere");
		}
		
		else
		{
           System.out.print("error");
		} 	
}
}