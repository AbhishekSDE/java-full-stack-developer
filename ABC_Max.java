import java.util.Scanner;

public class ABC_Max {
    public static void main (String[]ar)
    {
        int a,b,c,max;
        Scanner g=new Scanner(System.in);
        System.out.println("enter the value");
        a=g.nextInt();
        b=g.nextInt();
        c=g.nextInt();
        if (a>b)
        {
            if(a>c)
            {
                max=a;
            }
            else{
                max=c;
            }
        }
        else{
            if(b>c){
                max=b;
            }
            else{
                max=c;
            }
            System.out.println("max no is ="+max);

        }
        //System.out.println("max no is ="+max);

    }
    //System.out.println("max no is ="+max);

}
