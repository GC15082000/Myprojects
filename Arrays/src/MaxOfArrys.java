import java.util.Scanner;

public class MaxOfArrys {

	public static int MaxOfArrys(int arr[]) {
		int max = 0;
		for(int i=0;i<arr.length;i++)
		 {  
			if(arr[i]>max)
			{
				max=arr[i];
			}
		 }
		
		
		return max ;
		
	}
	
 public static int fibnocciseries(int n)
 {    int sum=0;
 	  int arr[]=new int[1+n];
 	   arr[0]=0;
 	   arr[1]=1;
	 for(int i=2;i<=n;i++)
	 {   			   
	     arr[i]=arr[i-1]+arr[i-2];	   
	 }
	  return arr[n];
 }
	public static int MinOfArrys(int arr[]) {
		int min = 0;
		for(int i=0;i<arr.length;i++)
		 {  
			if(arr[i]<min)
			{
				min=arr[i];
			}
		 }	
		return min ;
	}
	
	public static void pairSum(int arr[],int sum )
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
		}
		
		
	}
	
	public static void repeatationOfArrays(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]^arr[i+1])==0)
			return;
			
			if((arr[i]^arr[i+1])==1)
			System.out.print(arr[i]+ " " +arr[i+1]);
		}		
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int arr[]= {4,4,2,5,1,2,5};		
            // pairSum(arr,9);
             repeatationOfArrays(arr);
	}

}
