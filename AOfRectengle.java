import java.util.Scanner;

public class AOfRectengle {
    public   static void main (String[]ar)
    {
        int area,l,b;
        Scanner d=new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        l=d.nextInt();
        System.out.println("enter the breadth of rectangle");
        b=d.nextInt();
        area=l*b;//RULE OF RECTANGLE
        System.out.println("area of reactangle = "+area);



    }
}
