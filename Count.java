import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,ec=0,oc=0;
        n=sc.nextInt();
        x=new int[n];
        for (i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
            
                ec++;
            }
        }
        System.out.print(ec+" ");
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
            {
            
                oc++;
            }

            
        }
        System.out.print(oc+" ");
    }
}