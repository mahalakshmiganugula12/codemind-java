import java.util.Scanner;
class words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cs=0,cv=0,cd=0,cc=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                cs++;
            }
            else if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
            {
                cd++;
            }
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                cv++;
                
            }
            else
            {
                cc++;
            }
        }
        System.out.println("Vowels: " + cv);
        System.out.println("Consonants: " + cc);
        System.out.println("Digits: " + cd);
        System.out.println("White spaces: " + cs);
    }
}