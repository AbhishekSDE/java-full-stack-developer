package pattarn;

import java.util.Scanner;

public class O_pattarn {
         public static void main(String[]args)
         {
        	 int n;
             Scanner h= new Scanner(System.in);
             n=h.nextInt();
             System.out.println("lenth of pattern in ="+n);
     	  	for(int i=0;i<=n ;i++) {
     	  		for(int j=0;j<=n;j++) {
     	  			if(i==0||j==0||i==n||j==n) {
     	  		System.out.print("*");	
     	  			}
     	  			else
     	  			{
     	  				System.out.print(" ");
     	  			}
     	  		}
     	  		System.out.println();
     	  	}
     	  	
         }
}																																																																																																																																																																																																																												
