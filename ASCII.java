import java.util.Scanner;

public class ASCII {
    public static void main (String[]as)
    {
        char ch;
        System.out.println("enter the character");
        Scanner g=new Scanner(System.in);
        ch=g.next().charAt(0);
        int a=ch;
        System.out.println("ascii no is  "+a);
        
    }
    
}
