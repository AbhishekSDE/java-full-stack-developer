import java.util.Scanner;
public  class sum{
    public static void main(String[] args) {
        sum1();
        sum1();
    }
    static void sum1()
        {
            Scanner h= new Scanner(System.in);
            System.out.println("enter the no 1");
            int a=h.nextInt();
            System.out.println("enter the no 2");
            int b=h.nextInt();
            int sum2 =a+b;
            System.out.println("sum is "+sum2);

        }
    
}