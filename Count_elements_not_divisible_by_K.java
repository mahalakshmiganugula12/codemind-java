import java.util.Scanner;
class array
{
  public static void main(String args[ ])
  {
     Scanner sc=new Scanner(System.in);
     int x[ ],i,n,k,c=0;
     n=sc.nextInt( );
     k=sc.nextInt( );
     x=new int[n];
     for(i=0;i<n;i++)
     {
       x[i]=sc.nextInt( );
     }
     for(i=0;i<n;i++)
     {
         if (x[i]%k!=0)
         {
             c++;
             
         }
      
     }
     System.out.print(c);
     
  }
}