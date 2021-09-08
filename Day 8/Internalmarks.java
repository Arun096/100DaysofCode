import java.util.*;
import java.io.*;
class Students
{
 Scanner sc=new Scanner(System.in);
 Scanner scs=new Scanner(System.in);
 String cname;
 long rollno;
 int a,i,j,n,total;
 int mark[][]=new int[5][4];
 int marks[]=new int[5];
 void getdata()
 {
   System.out.print("The number of students:");
   n=sc.nextInt();
   System.out.println();
   for(a=0;a<n;a++)
   {
      System.out.print("Enter the student name:");
      cname=scs.nextLine();
      System.out.print("Enter the student rollno:");
      rollno=sc.nextLong();
      System.out.println();
      for(i=0;i<5;i++)
      {
         for(j=0;j<4;j++)
         {
            System.out.print("enter the exam "+(i+1)+" mark of subject" +(j+1)+ ":");
            mark[i][j]=sc.nextInt();
         }
         System.out.println();
      }
    }
}

void display()
{

    System.out.println("            MARK SHEET                " );
    System.out.println("-------------------------------------");
    System.out.println();
    System.out.print("\nThe Name:" +cname) ;
    System.out.println("\t\t\tRollno:" +rollno);

    for(i=0;i<5;i++)
    {
		System.out.println();
        System.out.println("Subject " +(i+1)+ " internal   :\t" +marks[i]);
    }
    System.out.println();
    System.out.println("-------------------------------------");
    System.out.println();
}
void main()
{
    for(a=0;a<n;a++)
    {
       for(i=0;i<5;i++)
       {
           total=0;
           for(j=0;j<4;j++)
           {
	       total+=mark[i][j];
	       marks[i]=total/4;
           }

        }
     }
  }
}
class Internalmarks
{
	public static void main(String[] args)
	{
		Students ob=new Students();
		ob.getdata();
		ob.main();
		ob.display();
    }
}















































