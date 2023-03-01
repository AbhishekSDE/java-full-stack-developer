package string;

import java.util.Scanner;

public class CopyOfString {

	public static void main(String[] args) {
		Scanner j= new Scanner (System.in);
		System.out.println("enter the string");
		String s1=j.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("cpy  = " +s2);		
       
	}

}
