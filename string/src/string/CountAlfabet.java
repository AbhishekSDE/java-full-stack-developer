package string;

import java.util.Scanner;

public class CountAlfabet {


	public static void main(String[] args) {
		String line;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the string : ");
		line = sc.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

		line = line.toLowerCase();
		for(int i = 0; i < line.length(); ++i)
		{
		char ch = line.charAt(i);
		if(ch =='a' || ch =='e'|| ch == 'i'
		|| ch == 'o' || ch == 'u') {
		++vowels;
		}
		else if((ch >='a'&& ch <= 'z')) {
		++consonants;
		}
		else if( ch >= '0' && ch <= '9')
		{
		++digits;
		}
		else if (ch ==' ')
		{
		++spaces;
		}
		else
		++symbols;
		}

		 System.out.println("vowels = "+vowels);
		 System.out.println("consonant = "+consonants);
		 System.out.println("number = "+digits);
		 System.out.println("space = "+spaces);
		 System.out.println("symbols = "+symbols);
		}
       
	}


