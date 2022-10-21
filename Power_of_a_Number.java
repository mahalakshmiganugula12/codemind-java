import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,a,b;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=(int)Math.pow(x,y);
        b=(a%z);
        System.out.println(b);
    }
}