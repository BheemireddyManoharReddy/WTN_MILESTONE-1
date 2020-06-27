import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements in an array");
		int num=sc.nextInt();
		//Declaration of Array with num size
		int arr[]=new int[num];
		for(int a=0;a<num;a++)
		{
			System.out.println("enter "+(a+1)+"st element");
			//entering the elements to the array
			arr[a]=sc.nextInt();
		}
		String str =null;
        for(int i: arr){
            str = Character.toString((char)i);
            System.out.println(str);
	}
	}
}