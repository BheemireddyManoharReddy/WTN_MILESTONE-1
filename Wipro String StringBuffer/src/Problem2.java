import java.util.*;
public class Problem2 {
	public static void main(String... args) {
		//Scanner class
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String[] s2=str.split(",");
		String str1=s2[0];
		String str2=s2[1];
		int len1=str1.length();
		int len2 = str2.length();
		if(str1.charAt(len1-1)==str2.charAt(0))
		{
			System.out.println(str1.toLowerCase()+str2.substring(1));
		}
		else
		{
			System.out.println(str1.toLowerCase()+" "+str2.toLowerCase());
		}
	}

}