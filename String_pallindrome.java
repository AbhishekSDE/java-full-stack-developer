import java.util.Scanner;

public class String_pallindrome {
    public static void main(String[]args)
    {
        String s,rev=" ";
        Scanner h =new Scanner(System.in);
        System.out.println("enter the string ");
        s=h.nextLine();
        for(int i=s.length()-1;i>=0;i++)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(s))
        {
            System.out.println("the string is palindrome ");
        }
        else
        {
            System.out.println("the string is not pallindrome");
        }

    }
    
}
