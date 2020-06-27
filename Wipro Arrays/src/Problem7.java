import java.util.*;
public class Problem7 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the total number of elements in an array");
	int num=sc.nextInt();
	//num denites the array size
	int arr[]=new int[num];
	System.out.println("Enter array elements");
	for(int i=0;i<num;i++)
	{
		System.out.println("enter "+(i+1)+"st elements");
		arr[i]=sc.nextInt();
	}
	// arrays need to be sorted to remove duplicate elements
	Arrays.sort(arr); 
	for (int i=0;i<num-1;i++)
	{
		//using the seperate index
		if(arr[i]!=arr[i+1]) //comparing with the next element
			System.out.println(arr[i]);
	}
	if(arr[num-2]!=arr[num-1])
		System.out.println(arr[num-1]);
	}

}