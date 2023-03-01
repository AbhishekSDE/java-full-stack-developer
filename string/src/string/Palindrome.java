package string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		boolean flag=false;
		Scanner g= new Scanner(System.in);
		System.out.println("enter the string palindrome");
		String ss=g.nextLine();
		String sss="";
        for(int i=ss.length()-1;i>=0;i--)
        {
        	sss=sss+ss.charAt(i);
        }
        System.out.println(sss);
        char [] ar1=ss.toCharArray();
        char [] ar2=sss.toCharArray();
        if(equals(ar1,ar2))//if(ss.equals(sss)
        {
        	System.out.println("it is palindrome");
        }
        else
        {
        	System.out.println("it is not palindorme");
        }
	}

	static boolean equals(char[] ar1, char[] ar2) {
		if (ar1.length!=ar2.length) {
			return false;
		}
		for(int i=0;i<ar1.length;i++)
			{
				if(ar1[i]!=ar2[i])
				{
					return false;
				}
			}
		
		return true;
	}
}