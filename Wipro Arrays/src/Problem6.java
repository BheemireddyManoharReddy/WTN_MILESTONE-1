import java.util.*;
public class Problem6 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the total number of elements in an array");
	int num=sc.nextInt();
	int arr[]=new int[num];
	System.out.println("Enter array elements");
	for(int a=0;a<num;a++)
	{
		System.out.println("enter "+(a+1)+"st element");
		arr[a]=sc.nextInt();
	}
	Arrays.sort(arr);
	for(int a=0;a<num;a++)
	{
		System.out.println(arr[a]);
	}
}
}