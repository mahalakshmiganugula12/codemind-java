import java.util.Scanner;
class Elem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,x[],n,sum=0,c=0,count=0,avg;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
 
            x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
            c++;
        }
        avg=sum/c;

        for(i=0;i<n;i++)
        {
            if(x[i]>=avg)
             count++;
          
        }
        System.out.println(count);
    
         
        
    }
}