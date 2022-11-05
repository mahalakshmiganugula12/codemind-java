import java.util.Scanner;
class palindrome
{
    public static boolean isPalin(int n)
    {
        int r,sum=0,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,m;
        t=sc.nextInt();
        while(t>0)
        {
            m=sc.nextInt();
            if(isPalin(m))
             System.out.println("True");
            else
             System.out.println("False");
        }
    }
}