import java.util.Scanner;
class max
{
  public static void main(String args[ ])
  {
     Scanner sc=new Scanner(System.in);
     int x[ ],n,m;
     n=sc.nextInt( );
     x=new int[n];
     for(int i=0;i<n;i++)
     {
        x[i]=sc.nextInt( );
     }
     m=x[0];
     for(int i=1;i<n;i++)
     {
        if(x[i]>m)
          m=x[i];

       
     }
     System.out.println(m);
  }
}