package string;

import java.util.Scanner;

public class DuplicateCharFromExString {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		Scanner f= new Scanner(System.in);
		System.out.println("enter first string");
		String str1=d.nextLine();
		System.out.println("enter second String ");
		String str2=f.nextLine();
		int []arr=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			for(int j = 0;j<str2.length();j++)
			{
				if((str1.charAt(i))==(str2.charAt(j)))
				{
					arr[str1.charAt(i)]++;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				System.out.println("duplicate cahracter from the string ="+(char)(i));
			}
		}
	}
}
