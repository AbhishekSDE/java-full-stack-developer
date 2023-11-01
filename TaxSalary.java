import java.util.Scanner;

public class TaxSalary {
    public static void main (String []as)
    {
        int sal;
        double tax;
        System.out.println(" enter  the salary");
        Scanner g= new Scanner(System .in);
        sal= g.nextInt();
        if(sal>=10000&&sal<=50000)
        {
            tax=sal*0.10;
            System.out.println(+sal+" taX IS "+tax);
        }
        else if(sal>=100000)
        {
            tax=sal*0.50;
            System.out.println(+sal+"tax is"+tax);
        }
        else {
            System.out.println("no tax");
        }

    }
    
}
