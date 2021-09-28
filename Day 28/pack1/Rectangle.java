package pack1;
import java.util.*;
public class Rectangle
{
   int a,width,height;
   Scanner sc=new Scanner(System.in);
   public void update()
   {
	  System.out.println("=======AREA OF RECTANGLE========");
      System.out.print("Enter the width: ");
      width=sc.nextInt();
      System.out.print("Enter the height: ");
      height=sc.nextInt();
      a=width*height;
      System.out.println("The area of Rectangle is: "+a);
      System.out.println("================================");
   }
}
