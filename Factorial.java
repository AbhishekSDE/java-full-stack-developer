import java.util.Scanner;

public class Factorial {
    public static void main (String[]as)
    {
        int fact=1,i,n;
        Scanner K= new Scanner(System.in);
        n=K.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
            //System.out.println("factoriaL OF given"+n+" equal "+fact);
        }
        System.out.println("factoriaL OF given"+n+" equal "+fact);
    }

}
