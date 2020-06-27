import java.util.Scanner;
public class Problem5 {
	public static void main(String... args) {
		//Scanner class
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//Finds the string length
		int lenstr=str.length();
		System.out.println(str.substring(1, lenstr-1));
	}
}