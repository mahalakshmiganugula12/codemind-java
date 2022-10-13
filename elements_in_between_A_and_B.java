import java.util.Scanner;
class elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],m,q,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        
            x[i]=sc.nextInt();
            m=sc.nextInt();
            q=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(x[i]>=m && x[i]<=q)
            {
                 c++;
                 System.out.print(x[i]+" ");
                
            }
             
             
            
        }
        if(c==0)
        System.out.println(-1);
        
    }
}
    