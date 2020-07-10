public class Problem2 {
	public static void main(String... args) { {
		int num=args.length;
		int sum=0;
		try
		{
			for (int irow=0;irow<num;irow++)
			{
				sum=sum+Integer.parseInt(args[irow]);
			}
			System.out.println("Avarage is "+sum/num);
		}
		catch(Exception e) //exception case
		{
			System.out.println(e);
		}	
	}
}
}