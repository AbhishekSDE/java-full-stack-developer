import java.util.Scanner;

public class VoteEligiblity {
    public static void main (String []as)
    {
        int age;
        System.out.println(" enter the person age");
        Scanner h= new Scanner(System.in);
        age=h.nextInt();
        if(age>18)
        {
            System.out.println("eligible to the vote");
        }
        else{
            System.out.println(" not eligible to the vote");
        }

    }
    
}
