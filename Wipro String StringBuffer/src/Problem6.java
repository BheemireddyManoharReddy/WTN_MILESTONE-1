import java.util.Scanner;
public class Problem6 {
	public static void main(String... args) {
		//Scanner class
		Scanner sc=new Scanner(System.in);
		//takes first string input
		String str=sc.next();
		//takes second string input
		String str1=sc.next();
		//calculates first string length
		int strlen=str.length();
		//calculates second string length
		int strlen1=str1.length();
		if (strlen<strlen1)
		{
			System.out.println(str+str1+str);
		}
		else
			System.out.println(str1+str+str1);
	}

}