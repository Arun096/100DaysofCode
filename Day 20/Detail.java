import java.util.*;
import java.io.*;
class Person
{
   int num;
   String cname,des;
   Scanner scs=new Scanner(System.in);
   Scanner sc=new Scanner(System.in);
   void update()
   {
      System.out.print("\nEnter the Name: ");
      cname=scs.nextLine();
      System.out.print("Enter the Number: ");
      num=sc.nextInt();
      System.out.print("Enter the Desgination: ");
      des=scs.nextLine();
  }
  void getdata()
  {
      System.out.println();
      System.out.println("The Name: "+cname);
      System.out.println("The Number: "+num);
      System.out.println("The Desgination: "+des);
      System.out.println();
   }
}
class Manager extends Person
{
    double salary,ded,netsalary;
    Scanner sc=new Scanner(System.in);
    void getManager()
    {
	   System.out.println();
       System.out.print("Enter the Salary: ");
       salary=sc.nextDouble();
       System.out.print("Enter the Deduction: ");
       ded=sc.nextDouble();
    }
    void updManager()
    {
       netsalary=salary-ded;
       System.out.println("=================DETAILS OF MANAGER==================");
       System.out.println();
       System.out.println("The Salary: "+salary);
       System.out.println("The Deduction: "+ded);
       System.out.println("Net salary: "+netsalary);
       System.out.println();
       System.out.println("=====================================================");
    }
}
class Employee extends Manager
{
    double salary,ded,netsalary;
    Scanner sc=new Scanner(System.in);
    void getEmployee()
    {
		System.out.println();
        System.out.print("Enter the Salary: ");
        salary=sc.nextDouble();
        System.out.print("Enter the Deduction: ");
        ded=sc.nextDouble();
    }
    void updEmployee()
    {
        netsalary=salary-ded;
        System.out.println("=================DETAILS OF EMPLOYEE==================");
        System.out.println();
        System.out.println("The Salary: "+salary);
        System.out.println("The Deduction: "+ded);
        System.out.println("Net salary: "+netsalary);
        System.out.println();
        System.out.println("=======================================================");
     }
}
class Clerk extends Employee
{
   double salary,ded,netsalary;
   Scanner sc=new Scanner(System.in);
   void getClerk()
   {
	   System.out.println();
       System.out.print("Enter the Salary: ");
       salary=sc.nextDouble();
       System.out.print("Enter the Deduction: ");
       ded=sc.nextDouble();
    }
    void updClerk()
    {
       netsalary=salary-ded;
       System.out.println("=================DETAILS OF CLERK==================");
       System.out.println();
       System.out.println("The Salary: "+salary);
       System.out.println("The Deduction: "+ded);
       System.out.println("Net salary: "+netsalary);
       System.out.println();
       System.out.println("===================================================");
     }
}
class Detail
{
     public static void main(String[] args)
     {
		 int choice,cont;
		 Scanner sc=new Scanner(System.in);
		 Clerk c=new Clerk();
		 do
		 {
		    System.out.println("**************DETAIS****************");
		    System.out.println("1.MANAGER\t2.EMPLOYEE\t3.CLERK\t");
		    System.out.println();
		    System.out.print("Enter ur choice: ");
		    choice=sc.nextInt();
            switch(choice)
            {
				case 1:
			    {
				   c.update();
                   c.getdata();
                   c.getManager();
                   c.updManager();
                   break;
			    }
			    case 2:
			    {
				   c.update();
                   c.getdata();
                   c.getEmployee();
                   c.updEmployee();
                   break;
			    }
			   case 3:
			   {
				   c.update();
				   c.getdata();
				   c.getClerk();
				   c.updClerk();
				   break;
		       }
		   }System.out.print("Enter 0 to quit and 1 to continue: ");
		    cont=sc.nextInt();
       }while(cont==1);
   }
 }











