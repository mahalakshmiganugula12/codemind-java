import java.util.Scanner;
class min
{
  public static void main(String args[ ])
  {
     Scanner sc=new Scanner(System.in);
     int x[ ],n,sum=0;
     n=sc.nextInt( );
     x=new int[n];
     for(int i=0;i<n;i++)
     {
        x[i]=sc.nextInt( );
     }
  
     for(int i=0;i<n;i++)
     {
       if(x[i]!=-99)
       {
           for(int j=0;j<n;j++)
           {
              if(x[i]==x[j] && i!=j)
              {
                  x[j]=-99;
              }
           }
       } 
     }
    for(int k=0; k<n; k++)
    {
       if(x[k]%2 == 0 && x[k] != -99)
            sum =sum+1;
    }
    System.out.println(sum);
  
  }
}