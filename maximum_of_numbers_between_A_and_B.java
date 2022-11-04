import java.util.Scanner;
class max
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],max,c=0,a,b;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        
            x[i]=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            
        
        max=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
                c++;
                if(x[i]>max)
                max=x[i];
            }
        }
        if(c==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(max);
        }
    }
}