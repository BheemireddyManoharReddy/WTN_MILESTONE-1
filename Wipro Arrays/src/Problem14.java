import java.util.*;
public class Problem14 {
	public static void main(String[] args) {
		//Scanner class
		Scanner sc = new Scanner(System.in);
		// A 3x3 Matrix
		int arr[][]=new int[3][3];
		int max=0;
		System.out.println("Enter nine elements into array");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The given array is :");
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(arr[i][j]>max)
					max=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+max);
	}
}