import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,sum=0,a,b;
        n=sc.nextInt();

        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
        
          a=sc.nextInt();
          b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            sum=sum+x[i];
            
        }
        System.out.println(sum);
        
    }
}