import java.util.Scanner;

public class GreatestAmongThreeNo {
    public static void main (String []ad)
    {
        int a,b,c;
        Scanner H=new Scanner(System .in);
        System.out.println("enter the no's");
        a=H.nextInt();
        b=H.nextInt();
        c=H.nextInt();
        if(a>b){
            if(a>c){
            System.out.println("a is greatest ");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        if(b>a){
            System.out.println(b);
       }
       else{
        System.out.println("c is greatest");
       }
    }
    
}
