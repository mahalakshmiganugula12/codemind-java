import java.util.Scanner;
class amicable
{
    public static boolean isamc(int n1,int n2)
    {
        int sum1=0,sum2=0;
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                sum1=sum1+i;
            }
        }
       for(int i=1;i<n2;i++)
        {
            if(n2%i==0)
            {
                sum2=sum2+i;
            }
        }
        if((sum1==n2)&& (sum2==n1))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(isamc(n1,n2))
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
        
    }
}