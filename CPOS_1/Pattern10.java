class Pattern10
{
	public static void main(String args[])
	{
		int letter=65;
		for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=4-i;k<=4;k++)
			{
				System.out.print((char)(letter+k)+" ");
			}
			System.out.println();
		}
	}
}
	
	/*
	I:\Basic>javac Pattern10.java

I:\Basic>java Pattern10
    E
   D E
  C D E
 B C D E
A B C D E
*/