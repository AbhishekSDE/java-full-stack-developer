import java.util.*;
public class VarArg {
   /*  public static void main(String[] args) {
        fun(12,4,5,6,67,6,7,8,90,9,6,5,6,9);
    }
    static void fun(int ...h)
    {
      System.out.println(Arrays.toString(h));
    }*/
    public static void main(String[] args) {
        multi(12,4,5,"abhishek","tinku","vikas");
    }
    static void multi(int a ,int b, int c,String ...h)
    {
        System.out.println(Arrays.toString(h));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
           
    }
}
  