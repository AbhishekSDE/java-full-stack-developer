import java.util.Scanner;

public class WithArg {
    public static void main(String[] args) {
        System.out.println("enrter the no's");
        Scanner h= new Scanner(System .in);
       int a = h.nextInt();
        int b = h.nextInt();
       int add= sum(a,b);
       System.out.println("sum is "+add);
         
    }
       static int sum(int x ,int y){
            int addtion =x+y;
            return addtion;
       }
    
}
