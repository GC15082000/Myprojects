import java.util.Scanner;
public class onefiftyone { 
	
public static void main(String[] args)
{ 	
	
 Scanner sc= new Scanner(System.in);
 int n= sc.nextInt();
 
 int arr[]=new int[n];
 
 for(int i=0; i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
 for(int i1=0;i1<arr.length;i1++)
	 {
	System.out.print(arr[i1]);		
	 }
 int n1= sc.nextInt();
 int array[]=new int [n1];
 for(int j=0; j<array.length;j++)
	{
		array[j]=sc.nextInt();
	}
 for(int j=0;j<array.length;j++)
	 {
		System.out.print(array[j]);		
	 }
 System.out.print(array[j]+arr[i1]);
		}
}