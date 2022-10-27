class Pattern18
{
	public static void main(String args[])
	{
		int letter=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((char)(letter+j)+" ");
			}
			System.out.println();
		}
	}
}

/*
A B C D E
A B C D
A B C
A B
A
*/
/*
class Pattern18
{
	public static void main(String args[])
	{
		int letter=64;
		int i=1,j,n=5;
		while(i<=n)
		{
			j=1;
			while(j<=6-i)
			
			{
				System.out.print((char)(letter+j)+" ");
				j++;
			}
			System.out.println();
			i++;
		
		}
		
	}
	
}
/*
A B C D E
A B C D
A B C
A B
A
*/