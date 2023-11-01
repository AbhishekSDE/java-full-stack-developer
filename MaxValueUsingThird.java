import java.util.Scanner;

public class MaxValueUsingThird {
    public static void main (String[]as)
    {
        int a,b,max;
        Scanner g= new Scanner(System .in);
        System.out.println("enter the no's=");
        a=g.nextInt();
        //System.out.println("a= "+a);
        b=g.nextInt();
        //System.out.println("b= "+b);
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        System.out.println("maximum  given no = "+ max);
    }
    
}
