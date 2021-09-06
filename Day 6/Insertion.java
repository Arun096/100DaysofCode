import java.util.Scanner;
class Insertion
{
  public static void main(String [] args)
  {
    fun ob=new fun();
    ob.main();
  }
}
class fun
{
   Scanner sc=new Scanner(System.in);
   int size,i,j,temp;
   void main()
   {
	   int num[]=new int[50];
	   System.out.print("Enter array size:");
	   size=sc.nextInt();
	   System.out.println();
       System.out.print("Enter the elements:");
       for(i=0;i<size;i++)
       {
           num[i]=sc.nextInt();
       }
       System.out.print("After Sorting:");
       for(i=1;i<size;i++)
       {
          temp=num[i];
          j=i-1;
          while((temp<num[j]) && (j>=0))
          {
             num[j+1]=num[j];
             j=j-1;
          }
          num[j+1]=temp;
       }
       for(i=0;i<size;i++)
       {
	       System.out.println(" " +num[i]);
       }
   }
}


