import java.util.*;
import java.io.*;
class Employee
{
    int empno;
    long mobileno;
    String name,add,email;
    Scanner sc=new Scanner(System.in);
    Scanner scs=new Scanner(System.in);
    void getdata()
    {
        System.out.print("enter the employee number:");
        empno=sc.nextInt();
        System.out.print("enter the employee name:");
        name=scs.nextLine();
        System.out.print("enter the employee mobile number:");
        mobileno=sc.nextLong();
        System.out.print("enter the employee address:");
        add=scs.nextLine();
        System.out.print("enter the employee email id:");
        email=scs.nextLine();
        System.out.println();
    }
    void display()
    {
		System.out.println();
        System.out.println("employee number=" +empno);
        System.out.println("employee name=" +name);
        System.out.println("employee mobile number=" +mobileno);
        System.out.println("employee address=" +add);
        System.out.println("employee email id=" +email);
        System.out.println();
    }
}
class Programmer extends Employee
{
    double da,hra,pf,club,bpay,gross,net;
    void getProg()
    {
        System.out.println("enter the basic pay:");
        bpay=sc.nextInt();
        System.out.println();
    }
    void updateProg()
    {
        da=(0.97*bpay);
        hra=(0.10*bpay);
        pf=(0.12*bpay);
        club=(0.1*bpay);
        gross=(bpay+da+hra);
        net=(gross-pf-club);
        System.out.println("**********PAY SLIP FOR PROGRAMMER**********");
        System.out.println();
        System.out.println("Basic pay=" +bpay);
        System.out.println("DA=" +da);
        System.out.println("HRA=" +hra);
        System.out.println("PF=" +pf);
        System.out.println("CLUB=" +club);
        System.out.println("GROSS=" +gross);
        System.out.println("NET=" +net);
        System.out.println();
        System.out.println("********************************************");
    }
}
class AsstProfessor extends Employee
{
    double da,hra,pf,club,bpay,gross,net;
    void getAsstProf()
    {
        System.out.println("enter the basic pay:");
        bpay=sc.nextInt();
        System.out.println();
    }
    void updateAsstProf()
    {
        da=(0.97*bpay);
        hra=(0.10*bpay);
        pf=(0.12*bpay);
        club=(0.1*bpay);
        gross=(bpay+da+hra);
        net=(gross-pf-club);
        System.out.println("******* PAY SLIP FOR ASSTPROFESSOR *******");
        System.out.println("Basic pay=" +bpay);
        System.out.println("DA=" +da);
        System.out.println("HRA=" +hra);
        System.out.println("PF=" +pf);
        System.out.println("CLUB=" +club);
        System.out.println("GROSS=" +gross);
        System.out.println("NET=" +net);
        System.out.println("********************************************");
    }
}
class  AssociateProfessor extends Employee
{
    double da,hra,pf,club,bpay,gross,net;
    void getAsscProf()
    {
        System.out.println("enter the basic pay:");
        bpay=sc.nextInt();
        System.out.println();
    }
    void updateAsscProf()
    {
        da=(0.97*bpay);
        hra=(0.10*bpay);
        pf=(0.12*bpay);
        club=(0.1*bpay);
        gross=(bpay+da+hra);
        net=(gross-pf-club);
        System.out.println("******* PAY SLIP FOR ASSOCIATE PROFESSOR *******");
        System.out.println("Basic pay=" +bpay);
        System.out.println("DA=" +da);
        System.out.println("HRA=" +hra);
        System.out.println("PF=" +pf);
        System.out.println("CLUB=" +club);
        System.out.println("GROSS=" +gross);
        System.out.println("NET=" +net);
        System.out.println("********************************************");
    }
}
class Professor extends Employee
{
    double da,hra,pf,club,bpay,gross,net;
    void getProf()
    {
        System.out.println("enter the basic pay:");
        bpay=sc.nextInt();
        System.out.println();
    }
    void updateProf()
    {
        da=(0.97*bpay);
        hra=(0.10*bpay);
        pf=(0.12*bpay);
        club=(0.1*bpay);
        gross=(bpay+da+hra);
        net=(gross-pf-club);
        System.out.println("******* PAY SLIP FOR PROFESSOR *******");
        System.out.println("Basic pay=" +bpay);
        System.out.println("DA=" +da);
        System.out.println("HRA=" +hra);
        System.out.println("PF=" +pf);
        System.out.println("CLUB=" +club);
        System.out.println("GROSS=" +gross);
        System.out.println("NET=" +net);
        System.out.println();
        System.out.println("********************************************");
    }
}
class Salary extends Employee
{
    public static void main(String[] args)
    {
        int choice,cont;
        Scanner c=new Scanner(System.in);
        do
        {
	    System.out.println();
	    System.out.println("**************************PAYSLIP GENERATION****************************************");
	    System.out.println();
            System.out.println("1.PROGRAMMER\t 2.ASSISANT PROFESSOR\t 3.ASSOCIATE PROFESSOR\t 4.PROFESSOR\t ");
            System.out.println();
            System.out.print("enter your choice:");
            choice=c.nextInt();
            switch(choice)
            {
                case 1:
                {
                    Programmer p=new Programmer();
                    p.getdata();
                    p.display();
                    p.getProg();
                    p.updateProg();
                    break;
                }

                case 2:
                {
		    AsstProfessor asst=new AsstProfessor();
                    asst.getdata();
                    asst.display();
                    asst.getAsstProf();
                    asst.updateAsstProf();
                    break;
	        }
                case 3:
                {
		    AssociateProfessor ap=new AssociateProfessor();
                    ap.getdata();
                    ap.display();
                    ap.getAsscProf();
                    ap.updateAsscProf();
                    break;
		}

                case 4:
                {
                    Professor f=new Professor();
                    f.getdata();
                    f.display();
                    f.getProf();
                    f.updateProf();
                    break;
		}
            }
            System.out.print("Enter 0 to exit and 1 to continue: ");
            cont=c.nextInt();
        }
        while(cont==1);
    }
}





