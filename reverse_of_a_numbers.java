import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,dig,sum=0;
        n=sc.nextInt();
        while(n>0)
        {
            dig=n%10;
            sum=sum*10+dig;
            n=n/10;
            
        }
        System.out.println(sum);
    }
}