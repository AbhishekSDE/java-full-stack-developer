import java.util.Scanner;

public class PrimeNo {
    public static void main (String []as)
    {
        int n,count=0;
        System.out.println("enter the no");
        Scanner j= new Scanner(System .in);
        n=j.nextInt();
        for (int i=1; i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }
    if(count==2){
        System.out.println("no is prime");
    }
    else{
        System.out.println("no is not prime");
    }
    }
    
}
