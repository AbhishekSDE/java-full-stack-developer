import java.util.Scanner;

public class FactorOfNum {
    public static void main (String[]AS)
   {
     int n;
     System.out.println("enter the no = ");
     Scanner h=new Scanner(System.in);
     n=h.nextInt();
     for(int i=1; i<=n;i++)
     {
        if(n%i==0)
        {
            System.out.print(i+"\t");
        }
     }

   }    
}
