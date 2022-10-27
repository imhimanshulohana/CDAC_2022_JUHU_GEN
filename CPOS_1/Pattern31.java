class Pattern31
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int n=2;n<=i;n++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=2;k<=5;k++)
		{
			for(int l=4;l>=k;l--)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=k;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/