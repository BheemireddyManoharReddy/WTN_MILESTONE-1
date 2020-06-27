import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements in an array");
		int num=sc.nextInt();
		//Declaration of Array with num size
		int sum=0;
		int arr[]=new int[num];
		float average;
		for(int a=0;a<num;a++)
		{
			System.out.println("enter "+(a+1)+"st element");
			//entering the elements to the array
			arr[a]=sc.nextInt();
			sum+=arr[a];
		}
		average=sum/num; // Calculating Average
		System.out.println("sum is "+sum+" average is "+average);
	}
}
