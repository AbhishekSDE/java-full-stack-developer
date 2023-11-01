import java.util.Scanner;

public class Charactor {
    public static void main (String []as)
    {
        char ch , ch2;
        System.out.println("enter the charactor");
        Scanner g=new Scanner(System .in);
        ch=g.next().charAt(0);
        if(ch>='A'&&ch<='Z')
        {
            ch2=Character.toLowerCase(ch);
            System.out.println("lowercase = "+ch2);
            
        }
        else {
            ch2=Character.toUpperCase(ch);
            System.out.println("uppercasem = "+ch2);
        }
    }
    
}
