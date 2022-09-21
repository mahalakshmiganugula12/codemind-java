import java.util.Scanner;
class prime1
{
   public static boolean isPrime(int n)
   {
     int count=0;
     for(int i=2;i<=(int)Math.sqrt(n);i++)
     {
        if(n%i==0)
         count++;
     }
     if(count==0)
      return true;
     else
      return false;
   }
   public static void main(String args[ ])
   {
       
        Scanner sc=new Scanner(System.in);
        int n,m,sum=0,p=0;
        n=sc.nextInt( );
        m=sc.nextInt( );
        sum=n+m;
        for(int i=sum+1;;i++)
        {
            p++;
            if(isPrime(i))
            break;
            
            
        }
        System.out.println(p);
        
   
   }
  
   
}