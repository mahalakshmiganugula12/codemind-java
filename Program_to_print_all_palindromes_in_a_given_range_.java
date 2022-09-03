import java.util.Scanner;
class primepalindrome
{
    
    public static boolean isPalindrome(int n)
    {
        int temp=n;
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
          return true;
        else
          return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,b;
        a=sc.nextInt();
        b=sc.nextInt();
        
        for(i=a;i<b;i++)
        {
            if((isPalindrome(i)))
            {
                System.out.print(i+" ");
                
            }
        }
    }
}