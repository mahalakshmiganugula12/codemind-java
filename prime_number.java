import java.util.Scanner;
class prime
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++)
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
        int n;
        n=sc.nextInt();
        if(isPrime(n))
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}