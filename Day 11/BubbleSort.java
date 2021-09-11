import java.util.*;
class Sort
{
  int n,i,j,temp;
  int a[]=new int[100];
  Scanner sc=new Scanner(System.in);
  void update()
  {
    System.out.print("Enter the number of elements:");
    n=sc.nextInt();
    System.out.println();
    System.out.print("Enter the " +n+ " array elements:");
    System.out.println();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=0;j<n-1;j++)
      {
        if(a[j+1]<a[j])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
   }
   void getdata()
   {
	  System.out.println();
	  System.out.println("The sorting elements are....");
      for(i=0;i<n;i++)
      {
		 System.out.println(+a[i]);

      }
      System.out.println();
   }
}
class BubbleSort
{
  public static void main(String[] args)
  {
     Sort ob=new Sort();
     ob.update();
     ob.getdata();
  }
}