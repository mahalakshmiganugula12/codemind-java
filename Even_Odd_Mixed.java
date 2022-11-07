import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,ec=0,oc=0;
     
        n=sc.nextInt();
        int len=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            if(n%2==0)
            ec++;
            else
            oc++;
            n=n/10;
            
        }
        if(ec==len)
        System.out.println("Even");
        else if(oc==len)
        System.out.println("Odd");
        else
        System.out.println("Mixed");
        
 
    }
}