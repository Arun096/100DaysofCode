import STACKADT.*;
import java.util.*;
import java.io.*;
class Stack implements ADT
{
   int n,i,top=0;
   int max=25;
   int a[]=new int[10];
   Scanner sc=new Scanner(System.in);
   public void create()
   {
        System.out.print("\nEnter the size of stack:");
   	n=sc.nextInt();
   	if(n<max)
   	{
   	    System.out.print("\nEnter the elements:");
   	    for(i=0;i<n;i++)
   		a[i]=sc.nextInt();
   	    top=n-1;
   	}
   	else
   	    System.out.println("stack is not created!");
   }
   public void push()
   {
   	int x;
   	if(top<max)
   	{
   		System.out.print("\nEnter the element to be pushed:");
   		x=sc.nextInt();
   		top=top+1;
   		a[top]=x;
   	}
   	else
   	    System.out.println("unable to push...");
   }
   public void pop()
   {
   	if(top<0)
   	{
          System.out.println("stack is UNDERFLOW");
   	}
   	else
   	{
   	     System.out.println("\nThe top element is deleted"+a[top]);
   	     top=top-1;
   	     n=top;
   	}
   }
   public void display()
   {
  	if(top<0)
  	{
  		System.out.println("stack is UNDERFLOW");
  	}
  	else
  	{
  		System.out.print("\nThe elements in the stack are...\n");
  		for(i=top;i>=0;i--)
  		  System.out.println(+a[i]);
  	}
  }
}
public class Stackarr
{
   public static void main(String [] args)
   {
    int choice,ch;
    ADT ob=new Stack();
	do
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("\n\n1.create \n2.push \n3.pop \n4.display\n");
	    System.out.print("\nEnter ur choice:");
        choice=sc.nextInt();
	    switch(choice)
	    {
	    	case 1:
	    	{
	             ob.create();
		     break;
		    }
		    case 2:
		    {
		         ob.push();
		         break;
		    }
		   case 3:
		   {
		         ob.pop();
		         break;
		   }
		   case 4:
		   {
		        ob.display();
		        break;
		   }
	   }
	   System.out.print("\nEnter 0 to quit and 1 to continue...\n");
       ch=sc.nextInt();
    }while(ch==1);
  }
}



