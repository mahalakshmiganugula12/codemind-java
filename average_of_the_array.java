import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,sum=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+x[i];
            c++;
        }
        System.out.format("%.2f",(float)sum/c);
    }
}