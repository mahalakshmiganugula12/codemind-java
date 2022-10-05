import java.util.Scanner;
class sum
{
    public static boolean isPrime(int n)
    {
        if(n<2)
         return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
             count++;
        }
        if(count==0)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,c=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(isPrime(i))
             c++;
        }
        System.out.println(c);
       
       
    }
}