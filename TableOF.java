import java.util.Scanner;

public class TableOF {
    public static void main (String []ad)
    {
        int a,t=0;
        System.out.print("enter the no =");
        Scanner h= new Scanner(System .in);
        a=h.nextInt();
        for(int i=1;i<=10;i++)
        {
          t=a*i;
          System.out.println(+a+"*"+i+"="+t );
        }
    }
    
}
