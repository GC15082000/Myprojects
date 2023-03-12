import java.util.Scanner;

public class forty {   
	public static void main(String[] args)	{ 	    
		Scanner sc= new Scanner(System.in);		
	int year=sc.nextInt();

       	int salary=sc.nextInt(); 
	if(year>=5) {
			int gbonus=(salary*5)/100;
			int total=salary+gbonus ;
			System.out.println(" bonus "+gbonus+" total: "+total);			
		}
	else {
		System.out.println("Salary: "+salary);
	
	}
	}
}