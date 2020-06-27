import java.util.Scanner;
public class Problem8 {
	public static void main(String... args) {
		//Scanner class
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.contains("*"))
		{
			int x=str.indexOf('*');
			System.out.println(str.substring(0, x)+str.substring(x+1, str.length()));
		}
		else
		{
			System.out.println(str);
		}
	}
}