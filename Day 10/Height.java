import java.util.*;
class main
{
  Scanner sc=new Scanner(System.in);
  int i,n,sum=0,count=0;
  int height[]=new int[10];
  double avg;
  void update()
  {
    System.out.print("Enter the number of Persons:");
    n=sc.nextInt();
    System.out.println();
    System.out.print("Enter the Height:");
    for(i=0;i<n;i++)
    {
       height[i]=sc.nextInt();
       sum=sum+height[i];
    }
    avg=sum/n;
    for(i=0;i<n;i++)
    {
      if(height[i]>avg)
      {
          count++;
	  }
    }
  }
  void display()
  {
    System.out.println();
    System.out.println("The Average height of persons:" +avg );
    System.out.println("Above Average of heights are:" +count);
    System.out.println();
  }
 }
 class Height
 {
    public static void main(String[] args)
    {
        main obj=new main();
        obj.update();
        obj.display();
    }
}



