package string;
import java .util.Scanner;
public class UniqueAlphabet {
      static boolean unique(String s) {
    	  	  for(int i=0;i<s.length()-1;i++)
    	  {
    		  for(int j=i+1;j<s.length();j++)
    		  {
    			  if(s.charAt(i)==s.charAt(j))
    			  {   char  ch=s.charAt(i);
    				  return true;
    			 }
    		  }
    	  }
    	  return false;
    		  
    	  
      }
	public static void main(String[] args) {
     Scanner st=new Scanner (System.in);
     System.out.println("enter the string");
     String str=st.nextLine();
    boolean g =unique(str);
    if(g==false)
     {
    	System.out.println("it is a unique String"); 
     }
     else
     {
    	 System.out.println("it is not unique string");
    	
     }

	}

}
