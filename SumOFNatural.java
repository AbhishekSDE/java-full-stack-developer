import java.util.Scanner;

public class SumOFNatural {
    public static void main (String []as)
    {
        int n,sum=0;
        System.out.println("enter the no==");
        Scanner j= new Scanner(System.in);
        n=j.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.print(i+"  ");
        }
        System.out.print("="+sum+"  ");
    }
    
}
