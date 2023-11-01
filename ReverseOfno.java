import java.util.Scanner;

public class ReverseOfno
{
    public static void main (String []as)
    { int i,r;
        System.out.println("enter the no");
        Scanner g= new Scanner(System .in);
        i=g.nextInt();
        while(i>0)
        {
            r=i%10;
            System.out.print(r);
            i=i/10;

        }
         
    }
}