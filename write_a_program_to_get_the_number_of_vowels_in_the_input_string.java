import java.util.Scanner;
class string1
{
    public static void main(String args[ ])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine( );
        int cv=0;
        for(int i=0;i<s1.length( );i++)
        {
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U')
            {
                cv++;
            }
        }
        if(cv!=0)
        System.out.println(cv);
        else
        System.out.println("0");
     
    
      
    }
}