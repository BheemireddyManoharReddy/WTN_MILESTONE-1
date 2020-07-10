import java.util.*;
//user defined exception class
class InvalidAge extends Exception
{
	InvalidAge()
	{
		System.out.println("user age is to be in the range of 18 to 30");
	}
}
public class Problem5 {
	static void registerUser(String userName,int Age) throws InvalidAge
	{
		String name;
		int age;
		name=userName;
		try {
		if(Age>=18 && Age<=60)
		{
			age=Age;
		}
		else throw new InvalidAge();
		System.out.println("User Registration Successfull");
		}
		catch (InvalidAge e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String... args) throws InvalidAge {
		//Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name");
		//name of the user
		String name=sc.nextLine();
		System.out.println("enter the user country");
		//country of the user
		int c=sc.nextInt();
		registerUser(name,c);
		
	}

}