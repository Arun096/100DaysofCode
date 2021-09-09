import java.util.*;
import java.io.*;
class StringManipulation
{
   public static void main(String[] args)throws IOException
   {
      ArrayList<String> obj=new ArrayList<String>();
      DataInputStream sc=new DataInputStream(System.in);
      int cont,choice;
      int i,j;
      String str,str1;
      do
      {
        System.out.println();
	System.out.println ("                   STRING MANIPULATION                  ");
	System.out.println();
        System.out.println("**********************************************************");
        System.out.println("1.Append at end \n2.Insert at particular index \n3.Search \n4.Size");
        System.out.println("5.Starting with specific letter \n6.Remove \n7.Sort \n8.Display");
         System.out.println("**********************************************************");
        System.out.println();
        System.out.print("Enter the choice:");
        choice=Integer.parseInt(sc.readLine());
        switch(choice)
        {
           case 1:
           {
               System.out.print("Enter the string:");
               str=sc.readLine();
               obj.add(str );
               break;
           }
           case 2:
           {
               System.out.print("Enter the string:");
               str=sc.readLine();
               System.out.print("Enter the position to insert:");
               i=Integer.parseInt(sc.readLine());
               obj.add(i-1,str);
               System.out.println("The array list: " +obj);
               break;
           }
           case 3:
           {
               System.out.print("Enter the string to search:");
               str=sc.readLine();
               j=obj.indexOf(str);
               if(j==-1)
               System.out.println("Element not found");
               else
               System.out.println("element found at" +j);
               break;
           }
           case 4:
           {
               System.out.println("Size of the list" +obj.size());
               break;
           }
           case 5:
           {
               System.out.print("Enter the string that starting with specific letter:");
               str=sc.readLine();
               for(i=0;i<(obj.size()-1);i++)
               {
                  str1=obj.get(i);
                  if(str1.startsWith(str))
                  {
                     System.out.println(str1);
                  }
               }
               break;
            }
            case 6:
            {
               System.out.print("Enter the string to remove:");
               str=sc.readLine();
               if(obj.remove(str))
               {
                  System.out.println("Removed String:" +str);
               }
               else
               {
                  System.out.println("string is not avilable");
               }
               break;
             }
             case 7:
             {
                Collections.sort(obj);
                System.out.println("The list is:" +obj);
                break;
             }
             case 8:
             {
                System.out.println("The array list is:" +obj);
                break;
             }
         }
         System.out.print("Enter 0 to exit and 1 to continue : ");
         cont=Integer.parseInt(sc.readLine());
       }while(cont==1);
     }
 }






