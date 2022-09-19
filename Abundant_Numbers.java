import java.util.Scanner;
class abundant
{
    public static boolean isAbundant(int n)
    {
        int sum=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
             sum=sum+i;
        }
        if(sum>n)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isAbundant(n))
    
           System.out.println("True");
        else
           System.out.println("False");
    }
}