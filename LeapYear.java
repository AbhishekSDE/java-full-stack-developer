
import java.util.Scanner;

public class LeapYear {
    public static void main (String[]f)
    {
        int y;
        Scanner h= new Scanner(System .in);
        System.out.println("enter the year==");
        y=h.nextInt();
       /*  if(y%100==0){
            if(y%400==0)
            { 
                System.out.println("the year id leap year");

            }
           
        }
        else if(y%100!=0){
            if(y%4==0)
            {
                System.out.println("the year is leap year");
            }
        
        else
        {
            System.out.println("the year is  not a leap year");
        }
    }
    }*/
    if(y%100==0&&y%400==0||y%100!=0&&y%4==0){
        System.out.println("the year is leap year");
    }
    else
    {
        System.out.println("the year is not leap year");
    }
}
}