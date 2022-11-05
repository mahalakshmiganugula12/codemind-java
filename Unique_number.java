import java.util.Scanner;
class maxnum
{
    public static boolean unique(int n)
    {
        int r1=0,r2=0,n1;
        while(n>0)
        {
            r1=n%10;
            n=n/10;
            n1=n;
            while(n1>0)
            {
                r2=n1%10;
                n1=n1/10;
                if(r1==r2)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(unique(n))
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}