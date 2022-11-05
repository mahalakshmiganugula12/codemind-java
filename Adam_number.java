import java.util.Scanner;
class Adam
{
    public static int isReverse(int n)
    {
        int sum=0,r,rev,r2,sum2=0;
        
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        rev=sum*sum;
        while(rev>0)
        {
            r2=rev%10;
            sum2=sum2*10+r2;
            rev=rev/10;
        }
        return sum2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,sq;
        a=sc.nextInt();
        sq=a*a;
        if(sq==isReverse(a))
         System.out.println("True");
        else
         System.out.println("False");
    }
}