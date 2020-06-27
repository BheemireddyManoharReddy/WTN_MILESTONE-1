import java.util.Scanner;
public class Problem11 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the num value");
	//num denotes the array size
	int num=sc.nextInt();
	System.out.println("enter array elements");
	int arr[]=new int[num];
	boolean flag=true;
	for (int i=0;i<num;i++)
	{
		//storing the array elements
		arr[i]=sc.nextInt();
		//checking whether value=1 or value=4
		if(arr[i]!=1 && arr[i]!=4)
		{
			flag=false;
			break;
		}
	}
	if(flag)
		System.out.println("true");
	else
		System.out.println("false");
}
}