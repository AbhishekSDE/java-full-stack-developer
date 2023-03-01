package string;

public class Pangram {

	public static void main(String[] args) {
		boolean flag=false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
	    s1=s1.replace(" ", "");
		char []ch=s1.toCharArray();
		int []arr=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int index =ch[i]-65;
			arr[index]++;
			//ar[ch[i]-65]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("it is not pangram");
				flag= true;
			}
		}
		if(flag==false)
		{
			System.out.println("it is pangram");
		}
		
	}

}
