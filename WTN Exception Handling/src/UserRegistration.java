import java.util.*;
class InvalidCountryException extends Exception
{
	InvalidCountryException()
	{
		System.out.println("User out side india cannot register");
	}
}
public class UserRegistration {
	static void registerUser(String userName,String userCountry)
	{
		String name,country;
		name=userName;
		try {
		if(userCountry.equalsIgnoreCase("India"))
		{
			country=userCountry;
		}
		else throw new InvalidCountryException();
		System.out.println("User Registration Successfull");
		}
		catch (InvalidCountryException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String... args) {
		//Scanner Class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  user name");
		String name=sc.next();
		System.out.println("enter the  user country");
		String country=sc.next();
		registerUser(name,country);
	}
}