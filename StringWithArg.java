import java.util.Scanner;

public class StringWithArg {
    public static void main(String[] args) {
        
        Scanner h= new Scanner(System.in);
        System.out.println("enter the name");
        String a=h.next();
        String p= myGreet(a);
        System.out.println(p);
    }
    static String myGreet(String n)
    { 
      String msg= "hello"+" "+n;
      return msg;

    }
}
