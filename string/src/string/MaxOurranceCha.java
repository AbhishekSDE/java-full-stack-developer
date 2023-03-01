package string;
import java.util.Scanner;
public class MaxOurranceCha {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the string");
	 String str=s.nextLine();
	 str.replace(" ", "");
	 int [] arr=new int [256];
	 for(int i=0;i<str.length();i++)
	 {
		 arr[str.charAt(i)]++;
	 }
	 int max=-1;
	char c=' ';
	for(int i=0;i<str.length();i++)
	{
		if(max<arr[str.charAt(i)])
		{
			max=arr[str.charAt(i)];
			c=str.charAt(i);
		}
	
	}
	System.out.println((char)(c)+" maximum ouccrance character  string = "+max);
	}

}
