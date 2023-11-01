
//armstrong if n=153 than (1*1*1)+(5*5*5)+(3*3*3)=153
import java.util.*;
public class Armstrong {
    public static void main (String []as)
    {
        int n,c,r,arm=0;
        System.out.println("enter the no ");
        Scanner g = new Scanner(System.in);
        n=g.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm)
        {
            System.out.println("armstrong no");
        }
        else
        {
            System.out.println("not armstrong no");
        }

    }
    
}
