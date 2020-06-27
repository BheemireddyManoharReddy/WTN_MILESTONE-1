import java.util.Scanner;
public class Problem4 {
	public static void main(String... args)  {
		//Scaneer class
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int strlen=str.length();
		if(strlen%2==0)
		{
			System.out.println(str.substring(0,strlen/2));
		}
		else
		{
			System.out.println("null");
		}
	}

}