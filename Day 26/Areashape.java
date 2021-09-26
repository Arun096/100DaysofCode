import Arun.*;
import java.util.*;
import java.io.*;
class Rectangle extends Shape
{
  int area,height,width;
  Scanner sc=new Scanner(System.in);
  public void printarea()
  {
     System.out.print("Enter the height: ");
     height=sc.nextInt();
     System.out.print("Enter the width: ");
     width=sc.nextInt();
     area=height*width;
     System.out.println("The Area of the Rectangle is: "+area);
  }
}
class Circle extends Shape
{
  double area,r;
  Scanner sc=new Scanner(System.in);
  public void printarea()
  {
     System.out.print("Enter the Radius: ");
     r=sc.nextInt();
     area=3.14*r*r;
     System.out.println("The Area of the Circle is: "+area);
  }
}
class Triangle extends Shape
{
  double area,base,height;
  Scanner sc=new Scanner(System.in);
  public void printarea()
  {
     System.out.print("Enter the base: ");
     base=sc.nextInt();
     System.out.print("Enter the height: ");
     height=sc.nextInt();
     area=0.5*height*base;
     System.out.println("The Area of the Triangle is: "+area);
  }
}
class Areashape
{
   public static void main(String [] args)
    {
      int choice,cont;
      Scanner sc=new Scanner(System.in);
      do
      {
         System.out.println("\n1.RECTANGLE\n2.CIRCLE\n3.TRIANGLE\n");
         System.out.print("Enter ur choice: ");
         choice=sc.nextInt();
         switch(choice)
         {
          case 1:
          {
             Shape obj1=new Rectangle();
             obj1.printarea();
             break;
          }
          case 2:
          {
             Shape obj2=new Circle();
             obj2.printarea();
             break;
          }
          case 3:
          {
             Shape obj3=new Triangle();
             obj3.printarea();
          }
        }System.out.print("Enter 0 to quit and 1 to continue: ");
         cont=sc.nextInt();
      }while(cont==1);
   }
}






