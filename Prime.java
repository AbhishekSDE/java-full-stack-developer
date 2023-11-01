import java.util.Scanner;

public class Prime {
    public static void main (String []as)
    {
      int n,count=0;
      Scanner h= new Scanner(System .in);
      System.out.print("enter the number =");
      n=h.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(n%i==0){
            count++;
        }
      }
      if(count==2){
        System.out.println("the number is prime");
      }
      else{
        System.out.println("the number is not prime");
      }
    }

    
}
