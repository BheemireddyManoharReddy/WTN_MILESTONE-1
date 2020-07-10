import java.util.*;
public class Problem1 {
	public static void main(String... args) {
	//Scanner Class
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	System.out.println("Enter the elements in the array");
	//declaration of array
	int arr[]=new int[n];
	try {
	for(int i=0;i<n;i++)
	{
		String str=sc.next();
		arr[i]=Integer.parseInt(str);
	}
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	System.out.println("Enter the index of the array elements in the array");
	int i=sc.nextInt();
	try
	{
		System.out.println("the array index at "+i+":"+arr[i]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
}
}