import java.util.Scanner;

public class fibonacci {
    public static void main (String []as)
    { int a=0,b=1,c,d;
        System.out.println("enter the no");
        Scanner h=new Scanner(System.in);
        d=h.nextInt();
         for(int i=1;i<=d;i++)
        {
          
            c=a+b;
            System.out.print( a+"  ");
            a=b;
            b=c;
        }

    }
    
}
