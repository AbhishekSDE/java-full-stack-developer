import java.util.Scanner;

class String_literal
{
    public static void main (String[]as)
    {
        String dname;
        Scanner f=new Scanner(System.in);
        dname= f.next();
        switch(dname){

                        case "monday":
                        System.out.println("1");
                        break;
                        case "teusdaY":
                        System.out.println("2");
                        break;
                        case "Wednesday":
                        System.out.println("3");
                        break; case "thursday":
                        System.out.println("4");
                        break; case "friday":
                        System.out.println("5");
                        break; case "saturday":
                        System.out.println("6");
                        break; case "sunday":
                        System.out.println("7");
                       
        }
    }
}