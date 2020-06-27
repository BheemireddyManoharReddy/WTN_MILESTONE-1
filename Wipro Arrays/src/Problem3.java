import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements in an array");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("enter the value  which to be searched");
		int value=sc.nextInt();// the value to be found
		int res=0;// the res whether it prints index or -1
		for(int i=0;i<num;i++)
		{
			System.out.println("enter "+(i+1)+"st element");
			arr[i]=sc.nextInt();
			if(arr[i]==value)
				res=i;
		}
		if(res!=0)
		{	System.out.println(res+1);}
		else
		{	System.out.println("-1");}
	}
}
