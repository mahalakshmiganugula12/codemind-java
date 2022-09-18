import java.util.Scanner;
class prime
{
    public static boolean isPrime(int n)
    {
        if(n<2)
         return false;
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
             c++;
        }
        if(c==0)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,c=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if (isPrime(i))
             c++;
        }
        System.out.println(c);
    }
}