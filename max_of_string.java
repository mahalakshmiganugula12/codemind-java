import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        char x=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>max)
            {
         
                max=ch;
                x=(char)max;
               
            }
        }
        System.out.println(x);
    }
}