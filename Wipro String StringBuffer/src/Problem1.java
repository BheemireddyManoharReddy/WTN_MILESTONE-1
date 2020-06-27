import java.util.*;
public class Problem1 {
	public static void main(String... args) {
		Scanner sc= new Scanner(System.in);
		//Scanner class
		String str=sc.next();
		boolean flag=true;
		int l=str.length();
		for (int i=0;i<(int)l/2;i++)
		{
			if(str.charAt(i)!=str.charAt(l-i-1))
			{
				flag=false;
				System.out.println("not palindrome");
				break;
			}
		}
		if(flag)
			System.out.println("palindrome");
	}

}