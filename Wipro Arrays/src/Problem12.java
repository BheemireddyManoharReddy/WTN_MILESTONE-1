import java.util.*;
public class Problem12 {
public static void main(String[] args) {
	//Scanner class
	Scanner sc =new Scanner(System.in);
	int array1[]=new int[3];
	int array2[] = new int[3];
	int array3[] =new int[2];
	System.out.println("enter array elements");
	for (int i=0;i<3;i++)
	{
		// reading array1 elemnets
		array1[i]=sc.nextInt();
	}
	for (int i=0;i<3;i++)
	{
		//reading array2 elements
		array2[i]=sc.nextInt();
	}
	//Taking middle elements
	array3[0]=array1[1];
	array3[1]=array2[1];
	//printing array3 with middle elements of array1 and array2
	System.out.println(array3[0]+","+array3[1]);
}
}