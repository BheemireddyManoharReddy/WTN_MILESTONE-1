import java.util.*;
public class Problem13 {
	public static void main(String[] args) {
		//Scanner class
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[2][2];
		System.out.println("Enter the array elements");
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The given array is:");
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is:");
		//reversing the rows
		for (int i=1;i>=0;i--)
		{
			//reversing the columns
			for(int j=1;j>=0;j--)
			{
				//printing the matrix in reverse order
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();//going to next line
		}
	}

}