import java.util.*;
class Add
{
  int num1,num2,c;
  public Add(int a,int b)
  {
     num1=a;
     num2=b;
  }
  public void add()
  {
     c=num1+num2;
     System.out.println("The Total=" +c);
  }
}
class Subtraction extends Add
 {
    public Subtraction(int a,int b,int x,int y)
    {
       super(x,y);
       num1=a;
       num2=b;
    }
    public void sub()
    {
      c=num1-num2;
      System.out.println("The difference=" +c);
    }
 }
 class Multiplication extends Subtraction
 {
    public Multiplication(int a,int b,int x,int y,int c,int d)
    {
       super(x,y,c,d);
       num1=a;
       num2=b;
    }
    public void multiple()
    {
      c=num1*num2;
      System.out.println("The Multiplication=" +c);
    }
 }
 class Division extends Multiplication
 {
   public Division(int a,int b,int x,int y,int c,int d,int e,int f)
   {
       super(x,y,c,d,e,f);
       num1=a;
       num2=b;
   }
   public void division()
   {
      c=(num1/num2);
      System.out.println("The Division=" +c);
   }
}
class MultilevelInherentance
{
  public static void main(String[] args)
  {
      Division ob=new Division(4,2,12,15,21,15,15,21);
      ob.division();
      ob.multiple();
      ob.sub();
      ob.add();
  }
}











