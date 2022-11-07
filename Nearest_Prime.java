import java.util.Scanner;
class nearprime
{
    public static boolean prime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,d1,d2;
        a=sc.nextInt();
        while(a>0)
        {
            b=sc.nextInt();
            for(int i=b;;i--)
            {
                if(prime(i))
                {
                    d1=i;
                    break;
                }
            }
            for(int i=b;;i++)
            {
                if(prime(i))
                {
                    d2=i;
                    break;
                }
            }
            if((b-d1)<=(d2-b))
            {
                System.out.println(d1);
            }
            else
            {
                System.out.println(d2);
            }
            a--;
        }
    }
}