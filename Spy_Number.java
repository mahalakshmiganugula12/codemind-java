import java.util.Scanner;
class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,prod=1,dig;
        n=sc.nextInt();
        while(n>0)
        {
            dig=n%10;
            sum=sum+dig;
            prod=prod*dig;
            n=n/10;
        }
        if(sum==prod)
          System.out.println("Spy Number");
        else
          System.out.println("Not Spy Number");
    }
}