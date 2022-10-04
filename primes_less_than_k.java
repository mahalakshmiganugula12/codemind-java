import java.util.Scanner;
class prime
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
        int n,x[],count=0,k;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        
            x[i]=sc.nextInt();
            k=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(isPrime(x[i]))
            {
                if(x[i]<=k)
                 count++;
                
            }
            
        }
        System.out.println(count);
    }
}