package string;

import java.util.Scanner;

public class DoplicateChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int []arr=new int[256];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
			{
				System.out.println((char)(i)+ " duplicate character in the string "+arr[i]);
			}
		}

	}

}
