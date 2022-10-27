class Pattern8
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=6-i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5 */
/*
class Pattern8
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=6-i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
	5
   5 4
  5 4 3
 5 4 3 2
5 4 3 2 1
*/