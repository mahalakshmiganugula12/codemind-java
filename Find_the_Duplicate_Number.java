import java.util.Scanner;
class dup
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if  (x[i]==x[j])
                {
                    System.out.println(x[i]);
                    break;
                }
            }
        }
        
    }
}