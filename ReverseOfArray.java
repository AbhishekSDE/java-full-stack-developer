import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {
    public static void main (String []as)
    {
        int ar[]=new int[5];
        Scanner n= new Scanner(System.in);
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=n.nextInt();
        }
        {
        System.out.println(Arrays.toString(ar));}
        System.out.println("reverse of array");
        for(int i=ar.length-1;i>=0;i--)
        {
            System.out.println(ar[i]);
        }
    }
}
