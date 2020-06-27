import java.util.*;
public class Problem2 { //finding max and min element in an array
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements in an array");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("enter "+(i+1)+"st element");
			arr[i]=sc.nextInt();
		}
		int max = arr[0]; 
		 for (int i = 0; i < num; i++) {  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }    
		 System.out.println("Largest element present in given array: " + max); 
		 int min = arr[0];  
		    for (int i = 0; i < min; i++) {   
		       if(arr[i] < min)  
		           min = arr[i];  
		    }    
		    System.out.println("Smallest element present in given array: " + min); 
		    }
}
