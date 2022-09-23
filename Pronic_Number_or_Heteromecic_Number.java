import java.util.Scanner;
class pronic
{
    public static boolean isPronic(int n)
    {

        int d=(int)Math.sqrt(n);
    
            if(d*(d+1)==n)
            return true;
            else

            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isPronic(n))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}