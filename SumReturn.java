import java.util.Scanner;

public class SumReturn {
    public static void main(String[] args) {
        int add=sum();
        System.out.println("addition "+add);
    }
    static int sum(){
      System.out.println("enter the value 1");
      Scanner h =new Scanner(System.in);
      int a =h.nextInt();
      System.out.println("enter the value 2");
      int b=h.nextInt();
      int sum2=a+b;
      return sum2;
    }
}
