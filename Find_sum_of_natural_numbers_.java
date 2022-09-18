import java.util.Scanner;
class natural
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            
        }
        System.out.println(sum);
    }
}