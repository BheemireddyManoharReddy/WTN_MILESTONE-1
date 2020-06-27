import java.util.Scanner;
public class Problem7 {
	public static void main(String... args) {
		//Scanner class
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.startsWith("x")&&str.endsWith("x"))
		{
			//Prints the string if it starts with x and ends with x
			System.out.println(str.substring(1, str.length()-1));
		}
		else if(str.startsWith("x"))
		{
			//Prints the string if it starts with x
			System.out.println(str.substring(1));
		}
		else if (str.endsWith("x"))
		{
			//Prints the string if it ends with x
			System.out.println(str.substring(0, str.length()-1));
		}
		else
		{
			System.out.println(str);
		}
	}

}