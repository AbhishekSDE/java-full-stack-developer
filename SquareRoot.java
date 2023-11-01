import java.util.Scanner;
public class SquareRoot {
    public static void main (String[]as)
    {
        int n;
        System.out.println("enter the no ");
        Scanner h= new Scanner(System.in);
        n=h.nextInt();
        double Sq=Math.sqrt(n);
        System.out.println("square of  "+n+" is "+Sq); 
 
}
}