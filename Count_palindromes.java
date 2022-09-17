import java.util.Scanner;
class paindrome
{
    public static boolean isPalindrome(int m)
    {
        int r,sum=0,temp=m;
        while(m>0)
        {
            r=m%10;
            sum=sum*10+r;
            m=m/10;
            
        }
        if(sum==temp)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if (isPalindrome(x[i]))
            c++;
        }
        System.out.println(c);
        
    }
}