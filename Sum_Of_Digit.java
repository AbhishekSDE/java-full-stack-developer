import java.util.Scanner;

public class Sum_Of_Digit {
 
    public static void main (String[]as)
    {
        int n, sum=0,r;
        Scanner g= new Scanner(System.in);
        System.out.println("enter the no ");
        n= g.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
            System.out.println("sum of digit = "+sum);
        

    }  
    
    
}
