import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            int prod=1;
            for(int j=1;j<=n;j++)
            {
                prod=prod*j;
               
            }
            System.out.println(prod);
        }
    }
}