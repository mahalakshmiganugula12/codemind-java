import java.util.Scanner;
class element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,k;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
            k=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            if(k==x[i])
            {
                System.out.print("True");
                System.exit(0);
            }
            
            
        }
        System.out.print("False");
    }
}