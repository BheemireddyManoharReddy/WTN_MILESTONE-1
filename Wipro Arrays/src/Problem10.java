import java.util.Scanner;
public class Problem10 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the num value");
	int num=sc.nextInt();
	System.out.println("Enter the array elements");
	int array1[]=new int[num];
	int array2[]=new int[num];
	for (int i=0;i<num;i++)
	{
		//Input Array
		array1[i]=sc.nextInt();
	}
	int count=0;
	for (int a=0;a<num;a++)
	{
		//checking even numbers
		if(array1[a]%2==0)
		{
			array2[count]=array1[a];
			count=count+1;
		}
	}
	for (int a=0;a<num;a++)
	{
		//checking odd numbers
		if(array1[a]%2!=0)
		{
			array2[count]=array1[a];
			count=count+1;
		}
	}
	for (int a=0;a<num;a++)
	{
		//output array 
		System.out.println(array2[a]);//first even numbers followed by odd numbers
	}
}
}