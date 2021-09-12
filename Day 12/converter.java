import java.util.*;
import java.io.*;
import distanceconversion.*;
import timeconversion.*;
class converter
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int choice,ch;
       distance d=new distance();
       timer t=new timer();
       do
       {
          System.out.println();
          System.out.println("1.Meter to kilometer ");
          System.out.println("2.kilometer to meter ");
          System.out.println("3.Miles  to kilometer ");
          System.out.println("4.kilometer to miles");
          System.out.println("5.Hours to Minutes");
          System.out.println("6.Hours to Seconds");
          System.out.println("7.Seconds to Hours");
          System.out.println("8.Minutes to Hours");
          System.out.println();
          System.out.print("Enter ur choice:");
          choice=s.nextInt();
          switch(choice)
          {
            case 1:
            {
               d.mtokm();
               break;
            }
            case 2:
            {
               d.kmtom();
               break;
            }
            case 3:
            {
               d.milestokm();
               break;
            }
            case 4:
            {
               d.kmtomiles();
               break;
            }
            case 5:
            {
               t.hourstominutes();
               break;
            }
            case 6:
            {
               t.hourstoseconds();
               break;
            }
            case 7:
            {
               t.secondstohours();
               break;
            }
            case 8:
            {
               t.minutestohours();
               break;
            }
         }System.out.println();
           System.out.println("Enter 0 to  quit and 1 to continue ");
           ch=s.nextInt();
      }while(ch==1);
    }
}



