import java.util.*;
public class Problem8 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the total number of elements in an array");
	//num denotes the array size
	int num=sc.nextInt();
	System.out.println("Enter array elements");
	int arr[]=new int[num];
	for(int a=0;a<num;a++)
	{
		System.out.println("enter "+(a+1)+"st element");
		arr[a]=sc.nextInt();
	}
	int sum=0;
	int temp=0;
	for (int p=0;p<num;p++)
	{// calculating the sum of elemnets 
			sum=sum+arr[p];
			// if any value is equal to 6
		if(arr[p]==6 && p!=num-1)
		{
			int q=p;
			while(q<num)
			{
			    temp=temp+arr[q]; // to calculate sum between 6 and 7 if exists
			    // taking the end value as 7
				if(arr[q]==7)
				break;
				q++;
			}}}
	System.out.println(sum-temp); // difference will prints the sum of array 
} }