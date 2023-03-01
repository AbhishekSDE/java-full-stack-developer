package string;

import java.util.Scanner;

public class Anagram {
	static void anagramStart(String str1, String str2) {
		str1= tolower(str1);
		str2= tolower(str2);
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		 sortedarray(arr1);
		 sortedarray(arr2);
		 if(arrayequal(arr1,arr2))
		 {
			 System.out.println("it is anagram");
		 }
		 else
		 {
			 System.out.println("it is not anagram");
		 }
	}
	
	static boolean arrayequal(char a[] ,char b[])
	{  
		if(a.length!=b.length)
		{
			return false;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}
	static char[] sortedarray(char[] arr) {
   	 for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{ char temp=0;
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				    
				}
			}
		}
		return arr;
	}

	static String tolower(String str1) {
		String str="";
		for(int  j=0;j<str1.length();j++)
       {
       	 if(str1.charAt(j)>='a'&& str1.charAt(j)<='z')
       	{
       		str=str+(char)(str1.charAt(j)-32);
       	}
		else {
			str=str+(char)(str1.charAt(j)+32);
       	}
       }
      return str;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the frist word ");
		String str1=s.nextLine();
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the second word ");
		String str2=ss.nextLine();
	    anagramStart(str1,str2);


}

	}
