
public class FC14 {
	public static void main(String args[])
	{
		int sum=0,m;
		int n=Integer.parseInt(args[0]);
	while(n>0)    
	{    
	m=n%10;    
	sum=sum+m;    
	n=n/10;    
	}    
	System.out.println(sum);
}
}
