import java.io.*;
import java.util.*;
class main
{
double principle,rate,time,ci;
main(double Principle,double Rate,double Time)
{
	principle=Principle;
	rate=Rate;
	time=Time;
}
void update()
{
	System.out.println("*********************************************");
	System.out.println();
	System.out.println(" The principle is:" +principle);
	System.out.println("The rate is:" +rate);
	System.out.println("The time is:" +time);
	System.out.println();
}
}
class interst extends main
{
double ci;
interst(double Principle,double Rate,double Time)
{
	super(Principle,Rate,Time);
	principle=Principle;
	rate=Rate;
	time=Time;
}
void getdata()
{
 ci=principle*(Math.pow(1+(rate/100),time));
 System.out.println("Compound Interst is:"+ci);
 System.out.println();
 System.out.println("**********************************************");
}
}
class Compound1
{
public static void main(String [] args)
{
double principle,rate,time,ci;
Scanner sc=new Scanner(System.in);
System.out.println("----------------------------------------");
System.out.println("|   COMPOUND INTEREST CALCULATION       |");
System.out.println("----------------------------------------");
System.out.println();
System.out.print("Enter the principle:");
principle=sc.nextDouble();
System.out.print("Enter the rate:");
rate=sc.nextDouble();
System.out.print("Enter the time:");
time=sc.nextDouble();
System.out.println();
interst i=new interst(+principle,+rate,+time);
i.update();
i.getdata();
}
}