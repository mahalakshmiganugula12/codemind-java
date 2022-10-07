import java.util.Scanner;
class small
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0,sum=0,count=0;
        float avg;
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
        avg=(float)sum/c;
        for(int i=0;i<n;i++)
        {
            if(x[i]<=avg)
             count++;
        }
        
        System.out.println(count);
    }
}