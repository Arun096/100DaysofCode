import java.util.Scanner;
public class Guess 
{
	public static void main(String[] args) 
	{
	    fun ob=new fun();
	    ob.main();
	}
}
class fun 
{
    Scanner sc=new Scanner(System.in);
    int secretNum,guess;
    boolean correct=false;
    void main()
    {
        System.out.print("enter the secret number:");
        secretNum=sc.nextInt();
        while(!correct)
        {
            System.out.print("Guess:");
            guess=sc.nextInt();
            if(guess==secretNum)
             {
               correct=true;
                System.out.println("YOU ARE RIGHT");
             }
            else if(guess<secretNum)
            {
                System.out.println("Higher");
            }
            else if(guess>secretNum)
            {
                System.out.println("Lower");
 
            }
        }
    }
}
