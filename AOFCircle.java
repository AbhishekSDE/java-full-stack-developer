import java.util.Scanner;

public class AOFCircle {
    public static void main (String []ac)
    {
       int r;
       double PI=3.14,area;
       Scanner h= new Scanner(System.in);
       System.out.println("enter the radius");
       r=h.nextInt();
       area=PI*r*r;
       System.out.println("area of circle = "+area);
       
    }
}
