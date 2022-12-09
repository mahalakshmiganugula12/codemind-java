import java.util.Scanner;
class string1
{
  public static void main(String args[ ])
  {
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine( );
     int c=0;
     for(int i=0;i<s1.length( );i++)
     {
       char ch=s1.charAt(i);
       if((ch>=97) && (ch<=122))
       {
           c++;
       }
       
       
          
     
     }
     System.out.println(c);
     
    
      
  }
}