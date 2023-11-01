import java.util.Scanner;

 public class Dcount
{
    public static void main (String []as)
    {
        int a,count=0;
        System.out.println("enter the no");
        Scanner g=new Scanner(System.in);
        a=g.nextInt();
        if(a>0)
        {
            a=a/10;
            count++;
        }
        System.out.println("digitcount = "+count);

    }
}
