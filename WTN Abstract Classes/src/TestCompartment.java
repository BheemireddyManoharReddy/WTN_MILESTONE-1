import java.util.Random;
abstract class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "It is first class compartment";
		
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "It is Ladies compartment";
		
	}
}
class General extends Compartment
{
	public String notice()
	{
		return "It is general compartment";
		
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "It is Luggage compartment";
		
	}
}
public class TestCompartment {
	public static void main(String... args) {
		Compartment compartments[] = new Compartment[10];
		Random rand = new Random();
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt(5);
	    	if(randomNum==0)
	    		continue;
	    	if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	System.out.println(compartments[i].notice());
	    }

}
}