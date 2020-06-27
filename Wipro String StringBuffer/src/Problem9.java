import java.util.Scanner;
public class Problem9 {
	public static void main(String... args) {
		//Scanner class
		Scanner sc = new Scanner(System.in);
		//First string
		String str = sc.next();
		//Second String
		String str1 = sc.next();
		int strlen=str.length();
		String ans="";
		String ans2;
		for(int i=0;i<strlen;i++)
		{
			ans2=""+str.charAt(i)+str1.charAt(i);
			ans=ans+ans2;
		}
		System.out.println(ans);
	}
}