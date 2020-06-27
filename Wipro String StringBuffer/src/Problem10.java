import java.util.Scanner;
public class Problem10 {
	public static void main(String... args)  {
		//Scanner class
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String[] str2=str.split(",");
		String str1=str2[0];
		int i=Integer.parseInt(str2[1]);
		int strlen1=str1.length();
		String finalstr;
		finalstr=str1.substring(strlen1-i,strlen1);
		for (int j=0;j<i;j++)
		{
			System.out.print(finalstr);
		}
	}
}