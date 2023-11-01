import java.util.Scanner;

public class Palindrome {
    public static void main (String []as)
    {
        int n,c,r,s=0;
        System.out.println("enter the no ");
        Scanner g = new Scanner(System.in);
        n=g.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;//palindrome copndition
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
    
}
