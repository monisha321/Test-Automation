package com.sgtesting.assgn12;
class Sub
{
	int[][] Matsub(int x[][],int y[][])
	{
		int c[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for( int j=0;j<x[i].length;j++)
			{
				c[i][j]=x[i][j]-y[i][j];
			}
		}
		return c;
	}
}
public class SubRet {

	public static void main(String[] args) {
		Sub s=new Sub();
		int a[][]= {{10,20,30},{40,50,60}};
		int b[][]= {{1,2,3},{4,5,6}};
		int res[][]=s.Matsub(a,b);
		for(int p=(res.length-1);p>=0;p--)
		{
			for(int q=(res[p].length-1);q>=0;q--)
			{
				System.out.print(res[p][q]+" ");
			}
			System.out.println();
		}


	}

}
