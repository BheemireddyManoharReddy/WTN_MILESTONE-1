import java.util.Scanner;
public class FC17 {
    public static void main(String args[]) {
      int x=10,reversed=0;
     Scanner sc =new Scanner(System.in);
     x=sc.nextInt();
     int y=x;
     while(x>0)
     {
         int r=x%10;
         reversed=reversed*10+r;
         x=x/10;
         }
         
         if(y==reversed)
         {
             System.out.println("palindrome");
         }
         else
            System.out.println("not a palindrome");

      
    }
}