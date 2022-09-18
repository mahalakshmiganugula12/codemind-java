import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,count=3;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(count<=n)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            count++;
        }
    }
}