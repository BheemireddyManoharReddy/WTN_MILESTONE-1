import java.util.Scanner;
public class Problem9 {
public static void main(String[] args) {
	//scanner class declaration
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the num value");
	//num  denotes the array size
	int num=sc.nextInt();
	//creating an array
	int arr[]=new int[num];
	System.out.println("Enter array elements");
	int count=0;
	for (int a=0;a<num;a++)
	{
		// temp stores the intial values 
		int temp=sc.nextInt();
		if(temp!=10) { 
			// removing the 10's value if exists
			arr[count]=temp;
			count++;
		}
	}
	for(int a=0;a<num;a++)
	{
		// prints the array by removing the 10's
		System.out.println(arr[a]);
}
}
}