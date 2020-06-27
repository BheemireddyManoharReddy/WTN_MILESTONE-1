
public class FC12 {
	public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);//number is passing as cmd line argument
        int cnt=0;
        for(int i=2;i<=Math.sqrt(n);i++)//using for loop
        {
            if(n%i==0)
            {
                cnt=1;
            }
        }
        if(cnt==0)//true if number is prime
        {
            System.out.println(n+" "+"number is prime");
        }
        else//true if number is not prime
        {
            System.out.println(n+" "+"number is not prime");
        }

    }
}
