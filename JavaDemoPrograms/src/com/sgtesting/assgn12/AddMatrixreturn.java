package com.sgtesting.assgn12;
class Add//The important rule to know is that when adding and subtracting matrices, first make sure the matrices have the same dimensions.
{
	int[][] Matadd(int x[][],int y[][])
	{
		int c[][]=new int[x.length][x[0].length];//can take y.length also
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
		for(int i=0;i<x.length;i++)
		{
			for( int j=0;j<x[i].length;j++)
			{
				c[i][j]=x[i][j]+y[i][j];
			}
		}
		}
		else
		{
			System.out.println("addition cant br performed");
		}
		return c;
	}
}
public class AddMatrixreturn {

	public static void main(String[] args) {
		Add s=new Add();
		int a[][]= {{1,2},{4,5}};
		int b[][]= {{1,2,3},{4,5,6}};
		int res[][]=s.Matadd(a,b);
		for(int p=0;p<res.length;p++)
		{
			for(int q=0;q<res[p].length;q++)
			{
				System.out.print(res[p][q]+" ");
			}
			System.out.println();
		}


	}

}
