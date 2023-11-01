import java.util.Scanner;

class MaxOfTwo{
    public static void main (String []as)
    {
        int a,b;
    Scanner f= new Scanner(System.in);
     System.out.println("enter the no ");
     a=f.nextInt();
     b=f.nextInt();
     if (a>b){
        
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
     
    }
}