import java.util.Scanner;

public class Power {
    public static void main (String []as)
    {
        double a ,p,r=1;
        System.out.println("enter the no ");
        Scanner g= new Scanner(System.in);
        a=g.nextInt();
        System.out.println("enter the power");
        p=g.nextInt();
        //for(int i=1;i<=p;i++)
       // {
            r=Math.pow(a,p);
      // }
        System.out.println(r);
    }
    
}
