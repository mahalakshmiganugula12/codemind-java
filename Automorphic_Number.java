import java.util.Scanner;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,len,dig=0;
        n=sc.nextInt();
        sq=n*n;
        len=(int)Math.log10(n)+1;
        dig=sq%(int)Math.pow(10,len);
        if(dig==n)
          System.out.println("Automorphic Number");
        else
          System.out.println("Not an Automorphic Number");
    }
}