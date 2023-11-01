import java.util.Scanner;

public class OodEven {
    public static void main (String[] args)
    {
        int a;
        Scanner g= new Scanner(System.in);
        System.out.print("enter the no.=");
        a=g.nextInt();
        if (a%2==0)
        {
            System.out.println("given no.is even");
        }
        else 
        {
            System.out.println("given no. is odd");
        }
    }
    
}
