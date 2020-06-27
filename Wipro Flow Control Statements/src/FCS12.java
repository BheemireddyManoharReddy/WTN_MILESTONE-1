
public class FCS12 {
	public static void main(String args[])
	{
	int digit1=Integer.parseInt(args[0]);
	int digit2=Integer.parseInt(args[1]);
	 digit1 =digit1%10;
     digit2 =digit2%10;
     if (digit1==digit2)
     {
    	 System.out.println("true");
     }
     else
     {
    	 System.out.println("false");
     }
}
}