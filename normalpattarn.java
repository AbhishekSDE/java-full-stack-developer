package pattarn;

import java.util.Scanner;

public class normalpattarn {
      	  	public static void main (String[]args)
      	  	{ int n;
              Scanner h= new Scanner(System.in);
              n=h.nextInt();
              System.out.println("lenth of pattern in ="+n);
      	  	for(int i=0;i<=n ;i++) {
      	  		for(int j=0;j<=n;j++) {
      	  		System.out.print("*");	
      	  		
      	  		}
      	  		System.out.println();
      	  	}
      	  	}
}
