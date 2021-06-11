package com.sgtesting.assgn13;
class Trans
{
	static int[][] arr()
	{
		int a[][]= {{1,2,4},{3,4,6}};
		
		int b[][]=new int[a[0].length][a.length];//important column size of a must be row size of b and vice versa
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{

				System.out.print(a[i][j]+" ");
				b[j][i]=a[i][j];

			}
			System.out.println();
		}
		return b;
	}
}
public class TransposeRet {

	public static void main(String[] args) {

		int c[][]=Trans.arr();
		System.out.println();
		for(int p=0;p<c.length;p++)
		{
			for(int q=0;q<c[p].length;q++)
			{
				System.out.print(c[p][q]+" ");
			}
			System.out.println();
		}
	}

}
