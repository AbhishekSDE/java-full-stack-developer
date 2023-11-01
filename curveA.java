package pattarn;

public class curveA {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((j==0&&i>0)||(i==0&&j>0&&j<n)||(j==n&&i>0)||i==n/2) {
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
