class Pattern9
{
	public static void main(String args[])
	{
		int letter = 65;
		for(char i=0;i<5;i++)
		{
			for (int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k=0;k<=i;k++)
			{
				System.out.print((char)(letter+k)+" ");
			}
			System.out.println();
		}
	}
}

/*
I:\Basic>javac Pattern9.java

I:\Basic>java Pattern9
    A
   A B
  A B C
 A B C D
A B C D E

*/