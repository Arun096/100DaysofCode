package pack2;
import java.util.*;
public class Square
{
   int num,a;
   Scanner sc=new Scanner(System.in);
   public void update1()
   {
	 System.out.println();
	 System.out.println("=======AREA OF SQUARE========");
     System.out.print("Enter the number: ");
     num=sc.nextInt();
     a=num*num;
     System.out.println("The area of Square is: "+a);
     System.out.println("=============================");
   }
}