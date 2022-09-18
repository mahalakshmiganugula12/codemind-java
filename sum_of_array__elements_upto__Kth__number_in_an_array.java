import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,sum=0,k;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
    
            x[i]=sc.nextInt();
            k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<=k)
             sum=sum+x[i];
        }
        System.out.println(sum);
    
    }
}