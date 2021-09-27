interface Java
{
    void towerofhanoi();
}
class Program implements Java
{
   int n,char from_rod,char to_rod,char aux_rod;
   void towerofhanoi()
   {
     if(n==1)
     {
        System.out.println("Disk 1 moved from "+from_rod+" to "+to_rod);
        return;
     }
    towerofhanoi(n-1,from_rod,aux_rod,to_rod);
    System.out.println("Disk "+n+ " moved from "+from_rod+" to "+to_rod);
    towerofhanoi(n-1,aux_rod,to_rod,from_rod);
}
class Towhan
{
  public static void main(String[] args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of disks:");
    sc=nextInt();
    towerofhanoi(n,'A','C','B');
    Java obj=new Program();
    obj.towerofhanoi();
  }
}







