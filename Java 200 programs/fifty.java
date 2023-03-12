
	import java.util.Scanner;

	public class fifty  {   
		public static void main(String[] args)
		{ 	  
			Scanner sc=new Scanner(System.in);
		    String str=sc.next();
		    int gc1=str.length();
			 for(int i=0;i<str.length();i++) {	
		   
		     System.out.println(str.charAt(0)+" " +str.charAt(gc1-1));
		    break;
			 }
			 
		}
	}

