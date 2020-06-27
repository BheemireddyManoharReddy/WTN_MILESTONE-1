import java.util.*;
public class Problem5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements in an array");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter array elements");
		for (int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max1=arr[0];
		int min1=99999;
		for (int i=0;i<num;i++)
		{
			if(arr[i]>max1)
				max1=arr[i];
			if(arr[i]<min1)
				min1=arr[i];
		}
		int max2=min1;
		int min2=max1;
		for (int i=0;i<num;i++)
		{
			if(arr[i]<min2 && arr[i]!=min1)
				min2=arr[i];
			if(arr[i]>max2 && arr[i]!=max1)
				max2=arr[i];
		}
		System.out.println("first maximum element "+max1);
		System.out.println("second maximum element "+max2);
		System.out.println("first minimum element "+min1);
		System.out.println("second maximum element "+min2);
		
	}
	

}