import java.io.*;
import java.util.Scanner;
class Employee
{
public static void main(String[] args)
{
scan e=new scan();
e.getdata();
}
}
class scan
{
int i;
int id,age;
String name,des;
double salary;
void getdata()
{
Scanner sc=new Scanner(System.in);
Scanner scs=new Scanner(System.in);
int arr[]=new int[4];
int myarr[]=new int[4];
int sarray[]=new int[4];
String[] myarray=new String[4];
String[] array=new String[4];
System.out.print("enter the employee id:");
for(i=0;i<4;i++)
{
arr[i]=sc.nextInt();
}
System.out.println();
System.out.print("enter the employee name:");
for(i=0;i<4;i++)
{
array[i]=scs.nextLine();
}
System.out.println();
System.out.print("enter the employee age:");
for(i=0;i<4;i++)
{
myarr[i]=sc.nextInt();
}
System.out.println();
System.out.print("enter the employee desgination:");
for(i=0;i<4;i++)
{
myarray[i]=scs.nextLine();
}
System.out.println();
System.out.println();
System.out.print("enter the employee salary:");
for(i=0;i<4;i++)
{
sarray[i]=sc.nextInt();
}
System.out.println();
for(i=0;i<4;i++)
{
System.out.println();
System.out.println("Details of emp "+(i+1)+"\n");
System.out.println("employee id=" +arr[i] );
System.out.println("employee name=" +array[i]);
System.out.println("employee age=" +myarr[i]);
System.out.println("employee desgination=" +myarray[i]);
System.out.println("employee salary=" +sarray[i]);
System.out.println();

}
}
}