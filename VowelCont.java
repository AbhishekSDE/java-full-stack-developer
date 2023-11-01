//a,e,i,o,u

import java.util.Scanner;

public class VowelCont {
  
    public static void main (String[]as){
        char ch;
        System.out.println("enter the character");
        Scanner h=new Scanner(System.in);
        ch=h.next().charAt(0);
        switch(ch)
        {
            case 'a':
            System.out.println("vowel");
            break;
            case 'e':
            System.out.println("vowel");
            break;
            case 'i':
            System.out.println("vowel");
            break;
            case 'o':
            System.out.println("vowel");
            break;
            case 'u':
            System.out.println("vowel");
            break;
            default:
            System.out.println("constant");
        }
    }
    
}
