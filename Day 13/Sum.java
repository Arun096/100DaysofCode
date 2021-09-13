import java.util.Scanner;
import java.io.*;
interface Inter
{
  void In();
}
class Add implements Inter
{
  int i,sum=0,n;
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[100];
  public void In()
  {
     System.out.print("Enter the number of elements: ");
      n=sc.nextInt();
      System.out.print("Enter the element of the array: ");
      for(i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.print("The Sum of the array elements is: ");
      for(i=0;i<n;i++)
      {
         sum=sum+arr[i];
      }
       System.out.println(+sum);
  }
}
class Sum
{
   public static void main(String [] args)
   {
      Inter i=new Add();
      i.In();
   }
}

