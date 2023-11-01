import java.util.Scanner;

public class PerfectNumber {
    public static void main (String[]we)
    {
        int n, sum=0;
        System.out.println("enter the no ");
        Scanner g= new Scanner(System.in);
        n=g.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
           }
           System.out.println("sum "+sum);
        if (n==sum)
        {
            System.out.println("no. is perfect");
        }
        else
        {
            System.out.println("nois not perfect");
        }
    }
    
}
